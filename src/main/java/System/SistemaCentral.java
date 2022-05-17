package System;

import Controllers.ControladorAula;
import Controllers.ControladorUsuario;
import Views.VistaSistema;
import Interfaces.ISistemaCentral;

import java.util.HashMap;

public class SistemaCentral implements ISistemaCentral{

	private ControladorUsuario controladorUsuario = new ControladorUsuario();
	private ControladorAula controladorAula = new ControladorAula();
	private VistaSistema VistaSistema;
	public SistemaCentral() {
	
	}
	
	public void iniciar() {
	
	}
	
	public String procesarPeticion(String url, HashMap<String , String> map) {
		switch (url){
			case "https://myupmclassroom/users/new":
				controladorUsuario.requestDarAlta();
				break;
			case "https://myupmclassroom/aulas":
				controladorAula.requestCrearAula();
				break;
			case "https://myupmclassroom/aulas/views":
				controladorAula.requestVerAula();
				break;
		}
		return null;
	}

}
