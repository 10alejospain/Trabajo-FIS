package Views;
import Controllers.ControladorAula;
import Controllers.ControladorSuscripciones;

import java.util.Scanner;

public class VistaSuscripciones {
    ControladorSuscripciones controladorSuscripciones;

    public VistaSuscripciones(ControladorSuscripciones controladorSuscripciones){
        this.controladorSuscripciones = controladorSuscripciones;
    }

    public void renderSuscribirseAula(ControladorAula controladorAula){
        System.out.printf("\n¿Que correo tienes?: ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        System.out.printf("\n¿Desea ver todas las salas? (Y/N): ");
        if (scanner.nextLine()=="Y" || scanner.nextLine()=="y"){
            controladorAula.requestVerAulas();
        }
        System.out.printf("\nIntroduzca el ID de la sala a la que quieres suscribirse: ");
        String id = scanner.nextLine();
        controladorSuscripciones.suscribirseAula(id,email);
    }

    public void renderDesuscribirseAula(){
        System.out.printf("\n¿Que correo tienes?: ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        System.out.printf("\nIntroduzca el ID de la sala a la que quieres desuscribirse: ");
        String id = scanner.nextLine();
        controladorSuscripciones.desuscribirseAula(id,email);
    }

    public void verAulasSuscritas(){

    }
}
