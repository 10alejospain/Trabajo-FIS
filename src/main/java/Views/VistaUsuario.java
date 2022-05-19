package Views;//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : VistaUsuario.java
//  @ Date : 28/04/2022
//  @ Author : 
//
//

import Controllers.ControladorUsuario;
import Interfaces.IAlumno;
import Interfaces.IPAS;
import Interfaces.IPDI;
import Interfaces.IUsuario;
import servidor.ObtencionDeRol;

import java.util.HashMap;
import java.util.Scanner;

public class VistaUsuario {
	private ControladorUsuario Controlador;

	public VistaUsuario( ControladorUsuario controladorUsuario) {
		this.Controlador = controladorUsuario;
	}
	
	public void renderAlumno(IAlumno alumno) {
		System.out.printf(alumno.toString());
	}
	
	public void renderPDI(IPDI pdi) {
		System.out.printf(pdi.toString());
	}
	
	public void renderPAS(IPAS pas) {
		System.out.printf(pas.toString());
	}

	public void renderUsuario(IUsuario usuario){
		String rol = ObtencionDeRol.get_UPM_AccountRol(usuario.getCorreo()).toString();
		if (rol == "ALUMNO"){
			renderAlumno((IAlumno) usuario);
		}
		else if (rol == "PAS"){
			renderPAS((IPAS) usuario);
		}
		else { //PDI
			renderPDI((IPDI) usuario);
		}
	}
	public void renderNewUsuario(){
		Scanner scanner = new Scanner(System.in);
		HashMap<String,String> datos = new HashMap<>();
		System.out.printf("\nIntroduce tu nombre: ");
		datos.put("nombre",scanner.nextLine());
		System.out.printf("\nIntroduce tu primer apellido: ");
		datos.put("primer apellido",scanner.nextLine());
		System.out.printf("\nIntroduce tu segundo apellido: ");
		datos.put("segundo apellido",scanner.nextLine());
		System.out.printf("\nIntroduce tu correo: ");
		String correo = scanner.nextLine();
		datos.put("correo",correo);
		System.out.printf("\nIntroduce tu constraseña: ");
		datos.put("contraseña",scanner.nextLine());
		System.out.printf("\nIntroduzca su dni: ");
		datos.put("dni",scanner.nextLine());
		String rol = ObtencionDeRol.get_UPM_AccountRol(correo).toString();// no se si esta logica deberia estar en la vista
		if (rol == "ALUMNO"){
			System.out.printf("\nIntroduzca tu numero de matricula");
			datos.put("matricula",scanner.nextLine());
		}
		else if (rol == "PAS"){
			System.out.printf("\nIntroduzca su codigo personal: ");
			datos.put("codigo personal",scanner.nextLine());
			System.out.printf("\nIntroduzca su año de incorporacion: ");
			datos.put("anio",scanner.nextLine());
		}
		else { //PDI
			System.out.printf("\n Introduzca su codigo de trabajador: ");
			datos.put("codigo",scanner.nextLine());
			System.out.printf("\n Introduzaca su categoria: ");
			datos.put("categoria",scanner.nextLine());
		}
		Controlador.darAlta(datos);
	}

	public void renderEliminarUsuario(){
		Scanner scanner = new Scanner(System.in);
		System.out.printf("¿Que usuario desea eliminar? Introduce su correo: ");
		String correoTemp = scanner.nextLine();
		Controlador.eliminarUsuario(correoTemp);
	}

	public void renderUpdateUsuario(){
		Scanner scanner = new Scanner(System.in);
		HashMap<String,String> datos = new HashMap<>();
		System.out.printf("\n¿Que usuario desea modificar? Introduzca su correo: ");
		String correo = scanner.nextLine();
		boolean seguir= true;
		while(seguir){
			System.out.printf("¿Que dato desea modificar?: ");
			String dato = scanner.nextLine();
			System.out.printf("¿Que valor nuevo le quiere asignar?: ");
			String valor = scanner.nextLine();
			datos.put(dato,valor);
			System.out.printf("¿Desea cambiar algo mas? (Y/N): ");
			String opcion = scanner.nextLine();
			if(opcion == "N"){
				seguir=false;
			}
		}

		Controlador.update(correo,datos);
	}
	public void renderVerUsuario(){
		Scanner scanner = new Scanner(System.in);
		System.out.printf("¿Que usuario desea ver? Introduzca su correo: ");
		String correo = scanner.nextLine();
		Controlador.verUsuario(correo);
	}
	public void renderError(String error){
		System.out.printf(error);
	}
}
