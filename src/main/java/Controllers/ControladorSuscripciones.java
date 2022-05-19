package Controllers;

import Views.VistaSuscripciones;

public class ControladorSuscripciones {

    ControladorAula CAula;
    ControladorUsuario CUsuario;
    VistaSuscripciones vistaSuscripciones = new VistaSuscripciones(this);

    ControladorSuscripciones (ControladorUsuario CUsuario, ControladorAula CAula){
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
        vistaSuscripciones.renderSuscribirseAula(CAula);
    }
}
