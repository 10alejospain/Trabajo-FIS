package Views;
import Controllers.ControladorAula;
import Controllers.ControladorSuscripciones;
import Models.Aula;

import java.util.List;
import java.util.Scanner;

public class VistaSuscripciones {
    ControladorSuscripciones controladorSuscripciones;

    public VistaSuscripciones(ControladorSuscripciones controladorSuscripciones){
        this.controladorSuscripciones = controladorSuscripciones;
    }

    public void renderSuscribirseAula1(){
        System.out.printf("\n¿Que correo tienes?: ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        controladorSuscripciones.suscribirse(email);
    }
    public void verAulasSuscritas(List<Aula> list){
        VistaAula vistaAula = new VistaAula();
        vistaAula.renderAulas(list);
    }
    public void renderSuscribirseAula2(String email){

        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nIntroduzca el ID de la sala a la que quieres suscribirse: ");
        String id = scanner.nextLine();
        controladorSuscripciones.suscribirseAula(id,email);
    }
    public void renderDesuscribirse1(){
        System.out.printf("\n¿Que correo tienes?: ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        controladorSuscripciones.desuscribirse(email);
    }

    public void renderDesuscribirseAula2(String email){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nIntroduzca el ID de la sala a la que quieres desuscribirse: ");
        String id = scanner.nextLine();
        controladorSuscripciones.desuscribirseAula(id,email);
    }

}
