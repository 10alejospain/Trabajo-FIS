package System;

import Controllers.ControladorAula;
import Controllers.ControladorUsuario;
import Views.VistaSistema;
import Interfaces.ISistemaCentral;

import java.util.HashMap;

public class SistemaCentral implements ISistemaCentral{

	private ControladorUsuario ControladorU;
	private ControladorAula ControladorA;
	private VistaSistema VistaSistema;
	public SistemaCentral() {
	
	}
	
	public void iniciar() {
	
	}
	
	public String procesarPeticion(String url, HashMap<String , String> map) {
		return null;
	}

}