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

        //buscar el aula con ese id
        //comprobar que existe
        //Comprobar qu existe el usuario y que sea de una clase hija de observador
        //Trnasformar un usuario a un observador
        //Meter al observador en el aula y el aula en el observador


    }
    public void desuscribirseAula(String idAula, String correoUsuario){

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
