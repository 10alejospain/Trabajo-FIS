package System;

import Controllers.ControladorAula;
import Controllers.ControladorSuscripciones;
import Controllers.ControladorUsuario;
import Views.VistaSistema;
import Interfaces.ISistemaCentral;

import java.util.HashMap;

public class SistemaCentral implements ISistemaCentral{

	private ControladorUsuario controladorUsuario = new ControladorUsuario();
	private ControladorAula controladorAula = new ControladorAula();
	private ControladorSuscripciones controladorSuscripciones = new ControladorSuscripciones(controladorUsuario, controladorAula);
	private VistaSistema VistaSistema;
	public SistemaCentral() {

	}
	
	public String procesarPeticion(String url) {
		switch (url){
			case "https://myupmclassroom/users/new":
				controladorUsuario.requestDarAlta();
				break;
			case "https://myupmclassroom/aulas/new":
				controladorAula.requestCrearAula();
				break;
			case "https://myupmclassroom/aulas/views":
				controladorAula.requestVerAula();
				break;
			case "https://myupmclassroom/aulas/update":
				controladorAula.requestUpdate();
				break;
			case "https://myupmclassroom/users/update":
				controladorUsuario.requestUpdate();
				break;
			case "https://myupmclassroom/aulas/delete":
				controladorAula.requestBorrarAula();
				break;
			case "https://myupmclassroom/users/delete":
				controladorUsuario.requestEliminarUsuario();
				break;
			case "https://myupmclassroom/users/views":
				controladorUsuario.requestVerUsuario();
				break;
			case "https://myupmclassroom/aulas/all":
				controladorAula.requestVerAulas();
				break;
			case"https://myupmclassroom/aulas/suscribe" :
				controladorSuscripciones.requestSuscribirseAula();
				break;
			case "https://myupmclassroom/aulas/unsuscribe":
				controladorSuscripciones.requestDesuscribirseAula();
				break;
		}
		return null;
	}


}
