package Controllers;//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : ControladorUsuario.java
//  @ Date : 28/04/2022
//  @ Author : 
//
//
import Interfaces.IAlumno;
import Interfaces.IPAS;
import Interfaces.IPDI;
import Models.*;
import System.SistemaCentral;
import Views.VistaUsuario;
import servidor.Autenticacion;
import servidor.ObtencionDeRol;
import servidor.UPMUsers;
import utilidades.Cifrado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ControladorUsuario {

	private SistemaCentral sistemaU;
	final VistaUsuario vista;

	private List<Usuario> usuarios = new ArrayList<Usuario>();//Usuarios registrados

 	private Usuario loggedUser;//Usuario loggeado

	public ControladorUsuario(){
		vista = new VistaUsuario(this);
	}
	public void darAlta(HashMap<String, String> map) {
		Autenticacion auth = new Autenticacion();
		String correo = map.get("correo");
		String rol = ObtencionDeRol.get_UPM_AccountRol(correo).toString();

		if (auth.existeCuentaUPM(correo)){
			if (rol == "ALUMNO"){
				Alumno alumno = new Alumno(
						map.get("nombre"),
						map.get("primer apellido"),
						map.get("segundo apellido"),
						map.get("correo"),
						Cifrado.cifrar(map.get("contraseña")),
						map.get("dni"),
						map.get("matricula")
				);

				usuarios.add(alumno);
			}
			else if (rol == "PAS"){
				PAS pas = new PAS(
						map.get("nombre"),
						map.get("primer apellido"),
						map.get("segundo apellido"),
						map.get("correo"),
						Cifrado.cifrar(map.get("contraseña")),
						map.get("dni"),
						Integer.parseInt(map.get("codigo personal")),
						Integer.parseInt(map.get("anio"))
				);

				usuarios.add(pas);
			}
			else { //PDI
				PDI pdi = new PDI(
						map.get("nombre"),
						map.get("primer apellido"),
						map.get("segundo apellido"),
						map.get("correo"),
						Cifrado.cifrar(map.get("contraseña")),
						map.get("dni"),
						map.get("Codigo"),
						map.get("categoria"),
						null
				);
				usuarios.add(pdi);
			}
		}
		else {
			vista.renderError("El correo proporcionado no existe en la BD de la UPM");
		}


	}
	
	public void requestDarAlta() {
		vista.renderNewUsuario();
	}
	
	public void eliminarUsuario(String correo) {
		for(Usuario usuario : usuarios){
			if(usuario.getCorreo().equals(correo)){
				usuarios.remove(usuario);
				break;
			}
		}
	}
	
	public void requestEliminarUsuario() {
		vista.renderEliminarUsuario();
	}

	public void update(String correo, HashMap<String , String > map) {
		usuarios.forEach((x) -> {
			if(x.getCorreo().equals(correo)){
				x.setCorreo(map.get("correo") != null ? map.get("correo") : x.getCorreo());
				x.setContraseña(map.get("contraseña") != null ? map.get("contraseña") : x.getContraseña());
				x.setDni(map.get("dni") != null ? map.get("dni") : x.getDNI());
				x.setNombre(map.get("nombre") != null ? map.get("nombre") : x.getNombre());
				x.setPrimerApellido(map.get("primer apellido") != null ? map.get("primer apellido") : x.getPrimerApellido());
				x.setSegundoApellido(map.get("segundo apellido") != null ? map.get("segundo apellido") : x.getPrimerApellido());
			}
		});
	}
	
	public void requestUpdate() {
		vista.renderUpdateUsuario();
	}
	
	public void verUsuario(String correo) {
		Autenticacion auth = new Autenticacion();
		if (auth.existeCuentaUPM(correo)){
			String rol = ObtencionDeRol.get_UPM_AccountRol(correo).toString();
			Usuario usuario =buscarUsuario(correo);
			if (rol == "ALUMNO"){
				vista.renderAlumno((Alumno) usuario);
			}
			else if (rol == "PAS"){
				vista.renderPAS((PAS) usuario);
			}
			else { //PDI
				vista.renderPDI((PDI) usuario);
			}
		}
		else {
			vista.renderError("El correo proporcionado no existe en la BD de la UPM");
		}
	}
	
	public void requestVerUsuario() {
		vista.renderVerUsuario();
	}
	
	public Usuario buscarUsuario(String correo) {
		for (int x = 0; x < usuarios.size(); x++) {
			if(usuarios.get(x).getCorreo().equals(correo)){
				return usuarios.get(x);
			}
		}
		vista.renderError("No existe ningun usuario con este correo");
		return null;
	}


	public void login(String correo, String pass){
		Usuario usr = buscarUsuario(correo);
		if (usr != null){
			String hashPass = Cifrado.cifrar(pass);
			if (hashPass.equals(usr.getContraseña())){
				this.loggedUser = usr;
			}
			else {
				vista.renderError("Contraseña incorrecta");
			}
		}
	}

	public void logout(){
		if(loggedUser != null){
			loggedUser = null;
		}
	}


}
