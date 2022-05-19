package Views;//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : VistaAula.java
//  @ Date : 28/04/2022
//  @ Author : 
//
//

import Controllers.ControladorAula;
import Interfaces.*;
import Models.Aula;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class VistaAula {
	private ControladorAula controladorAula;
	public VistaAula( ControladorAula controladorA) {
		this.controladorAula = controladorA;
	}
	
	public String renderAula(IAula aula) {
		return "************************************************************" +
				"\nVISTA AULA " + aula.getId() +
				"\nCentro: " + aula.getCentro() +
				"\nNumero del Centro: " + aula.getNumero_Centro() +
				"\nSuperficie del aula: " + aula.getSuperficie() + " m2" +
				"\nAforo del aula: " + aula.getAforo() + " personas" +
				"\nTipo de aula: " + aula.getTipo()+
				"\n************************************************************";
	}

	public void renderNewAula(){
		Scanner scanner = new Scanner(System.in);
		PrintStream j = System.out;
		HashMap<String,String> datos = new HashMap<>();
		j.print("ID del aula: ");
		datos.put("id",scanner.nextLine());
		j.print("Centro del aula: ");
		datos.put("centro", scanner.nextLine());
		j.print("Numero del centro: ");
		datos.put("numeroCentro", scanner.nextLine());
		j.print("Superficie del aula (en m2): ");
		datos.put("superficie", scanner.nextLine());
		j.print("Aforo maximo del aula: ");
		datos.put("aforo", scanner.nextLine());
		j.print("Tipo de aula: ");
		datos.put("tipo", scanner.nextLine());
		controladorAula.crearAula(datos);
	}

	public void renderUpdateAula(){
		Scanner scanner = new Scanner(System.in);
		HashMap<String,String> datos = new HashMap<>();
		System.out.printf("\n¿Que aula desea modificar? Introduzca su id: ");
		String id = scanner.nextLine();
		boolean seguir= true;
		while(seguir){
			System.out.printf("¿Que dato desea modificar?: ");
			String dato = scanner.nextLine();
			System.out.printf("¿Que valor nuevo le quiere asignar?: ");
			String valor = scanner.nextLine();
			datos.put(dato,valor);
			System.out.printf("¿Desea cambiar algo mas? (Y/N): ");
			String opcion = scanner.nextLine();
			if(opcion == "N" || opcion == "n"){
				seguir=false;
			}
		}

		controladorAula.update(id,datos);
	}

	public void renderEliminarAula(){
		Scanner scanner = new Scanner(System.in);
		System.out.printf("¿Que aula desea eliminar? Introduce su id: ");
		String idtemp = scanner.nextLine();
		controladorAula.borrarAula(idtemp);
	}
	public void renderVerAula(){// Este metdo deberia implementar lo que hay en requestVerAula() ahora y pasarle por parametro el id del aula
		Scanner scanner = new Scanner(System.in);

		System.out.printf("");
		String idAula = scanner.nextLine();//Se puede implementar o bien metiendo un metodo que muestre todas las aulas disponibles o bien pidiendo el id del aula



		controladorAula.requestVerAula();
	}
	public void renderAulas(List<Aula> aulas){
		for(Aula aula : aulas){
			System.out.printf("\n"+aula.toString());
		}
	}

}
