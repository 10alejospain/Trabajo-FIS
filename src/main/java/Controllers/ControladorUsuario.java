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

import Models.Usuario;
import System.SistemaCentral;
import Views.VistaUsuario;

import java.util.HashMap;
import java.util.List;


public class ControladorUsuario {
	private List<Usuario> usuarios;
	private SistemaCentral sistemaU;
	private VistaUsuario vista;

	public ControladorUsuario(){
		vista = new VistaUsuario(this);
	}
	public void darAlta(HashMap<String, String> map) {
		String correo = map.get("correo");

		//if ()
	}
	
	public void requestDarAlta(Usuario usr) {
		vista.renderNewUsuario();
	}
	
	public void eliminarUsuario(String correo) {

	}
	
	public void requestEliminarUsuario() {
		vista.renderUpdateUsuario();
	}
	
	public void update(String correo, HashMap<String , String > map) {

	}
	
	public void requestUpdate() {
		vista.renderUpdateUsuario();
	}
	
	public void verUsuario(String correo) {
		buscarUsuario(correo).toString();
	}
	
	public void requestVerUsuario() {

	}
	
	public Usuario buscarUsuario(String correo) {
		for(int x=0; x<usuarios.size(); x++){
			if(usuarios.get(x).getCorreo() == correo){
				return usuarios.get(x);
			}
		}
		return null;
	}
	public void login(String correo){

	}

	public void logout(){

	}
}