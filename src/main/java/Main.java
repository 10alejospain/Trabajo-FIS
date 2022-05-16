import System.SistemaCentral;
import Views.VistaSistema;

public class Main {
    public static void main(String[] args) {
        SistemaCentral sistemaCentral = new SistemaCentral();
        VistaSistema vistaSistema = new VistaSistema(sistemaCentral);
        vistaSistema.renderPaginaPrincipal();
    }
}
