package Controllers;//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : ControladorAula.java
//  @ Date : 28/04/2022
//  @ Author : 
//
//


import Interfaces.IAula;
import Models.Aula;
import System.SistemaCentral;
import Views.*;

import java.util.*;

public class ControladorAula {

	private SistemaCentral sistemaCentral;
	private VistaAula vistaAula = new VistaAula(this);
	private List<Aula> aulas = new ArrayList<Aula>();
	public void crearAula(HashMap<String , String> map) {
		Random random = new Random();
		Aula aula = new Aula(
				map.get("id"),
				map.get("centro"),
				Integer.parseInt(map.get("numeroCentro")),
				Double.parseDouble(map.get("superficie")),
				Integer.parseInt(map.get("aforo")),
				map.get("tipo")
		);
		vistaAula.renderAula(aula);
		aulas.add(aula);
	}

	//Parametro cambiado, dado a que el id es un int no un string.
	public void borrarAula(String id) {
		aulas.forEach((x) -> {
			if(Objects.equals(x.getId(), id)) {
				aulas.remove(x);
			}
		});
	}

	//Parametro cambiado, dado a que el id es un int no un string.
	public void update(String id, HashMap<String , String> map) {
		aulas.forEach((x) -> {
			if(Objects.equals(x.getId(), id)){
				x.setCentro(map.get("centro") != null ? map.get("centro") : x.getCentro());
				x.setNumeroCentro(map.get("numeroCentro") != null ? Integer.parseInt(map.get("numeroCentro")) : x.getNumeroCentro());
				x.setSuperficie(map.get("superficie") != null ? Double.valueOf(map.get("superficie")) : x.getSuperficie());
				x.setAforo(map.get("aforo") != null ? Integer.parseInt(map.get("aforo")) : x.getAforo());
				x.setTipo(map.get("tipo") != null ? map.get("tipo") : x.getCentro());
			}
		});
	}

	
	public void requestVerAula() {
		vistaAula.renderIDAula();
	}
	public void verAula(String  IDAula){
		for(Aula aula: aulas){
			if (aula.getId().equals(IDAula)){
				vistaAula.renderAula(aula);
				break;
			}
		}
		System.out.printf("\nNo existe un aula con ese id: "+ IDAula);
	}

	public void requestVerAulas(){
		vistaAula.renderAulas(aulas);
	}
	
	public void requestCrearAula() {
		this.vistaAula.renderNewAula();
	}
	
	public void requestBorrarAula() {
		this.vistaAula.renderEliminarAula();
	}
	
	public void requestUpdate() {this.vistaAula.renderUpdateAula();}

	public Boolean verSiExiste(String id){
		for(Aula aula : aulas){
			if(aula.getId().equals(id)){
				return true;
			}
		}
		return false;
	}

	public Aula sacarPorID(String id){
		for (Aula aula : aulas){
			if (aula.getId().equals(id)){
				return aula;
			}
		}
		return null;
	}


}
