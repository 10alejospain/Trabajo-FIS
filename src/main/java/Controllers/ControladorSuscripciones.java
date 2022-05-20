package Controllers;

import Models.Observador;
import Views.VistaSuscripciones;

import java.util.ArrayList;
import java.util.List;

public class ControladorSuscripciones {

    private ControladorAula CAula;
    private ControladorUsuario CUsuario;
    private VistaSuscripciones vistaSuscripciones = new VistaSuscripciones(this);
    private List<Observador> observadores = new ArrayList<>();

    public ControladorSuscripciones (ControladorUsuario CUsuario, ControladorAula CAula){
        this.CUsuario = CUsuario;
        this.CAula = CAula;
    }

    public void  suscribirseAula(String idAula, String correoUsuario){

        if(!CAula.verSiExiste(idAula)){
            vistaSuscripciones.renderError("Este aula no existe");
        }else if(CUsuario.buscarUsuario(correoUsuario)==null){
            vistaSuscripciones.renderError("Este usuario no existe");
        }else {
            Observador temporal = (Observador) CUsuario.buscarUsuario(correoUsuario);
            if(!observadores.equals(temporal)){
                observadores.add(temporal);
            }
            observadores.get(observadores.indexOf(temporal)).addAula(CAula.sacarPorID(idAula));
        }
    }
    public void desuscribirseAula(String idAula, String correoUsuario){
        if(!CAula.verSiExiste(idAula)){
            vistaSuscripciones.renderError("\nEste aula no existe");
        }else if(CUsuario.buscarUsuario(correoUsuario)==null){
            vistaSuscripciones.renderError("\nEste usuario no existe");
        }else {
            Observador temporal = (Observador) CUsuario.buscarUsuario(correoUsuario);
            if(!observadores.equals(temporal)){
                vistaSuscripciones.renderError("\nEste usuario no es un observador");
            }else if(!observadores.get(observadores.indexOf(temporal)).equals(CAula.sacarPorID(idAula))){
               vistaSuscripciones.renderError("\nEste usuario no esta suscrito a esa aula");
            }else {
                observadores.get(observadores.indexOf(temporal)).removeAula(CAula.sacarPorID(idAula));
            }
        }

    }
    public void requestSuscribirseAula(){
        vistaSuscripciones.renderSuscribirseAula1();
    }
    public void suscribirse(String email){
        vistaSuscripciones.verAulasSuscritas(findEmail(email).getAulasSubscritas());
        vistaSuscripciones.renderSuscribirseAula2(email);
    }
    public void requestDesuscribirseAula(){
        vistaSuscripciones.renderDesuscribirse1();
    }
    public void desuscribirse(String email){
        vistaSuscripciones.verAulasSuscritas(findEmail(email).getAulasSubscritas());
        vistaSuscripciones.renderDesuscribirseAula2(email);
    }
    public Observador findEmail(String email){
        for(Observador obv : observadores){
            if (obv.getCorreo() == email){
                return obv;
            }
        }
        return null;
    }
}
