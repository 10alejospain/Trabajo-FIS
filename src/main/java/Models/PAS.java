package Models;
import Interfaces.IPAS;

public class PAS extends Usuario implements IPAS {
  private int codigoPersonal;
  private int añoIncorporacion;

    public int getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(int codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public int getAñoIncorporacion() {
        return añoIncorporacion;
    }

    public void setAñoIncorporacion(int añoIncorporacion) {
        this.añoIncorporacion = añoIncorporacion;
    }

    public PAS(String nombre, String primerApellido, String segundoApellido, String correo, String contraseña, String dni, int codigoPersonal, int añoIncorporacion) {
        super(nombre,primerApellido,segundoApellido,correo,contraseña,dni);
        this.codigoPersonal = codigoPersonal;
        this.añoIncorporacion = añoIncorporacion;
    }

    @Override
    public String toString(){
        return super.toString() + "Codigo Personal: " + codigoPersonal + "Año de Incorporacion: "+ añoIncorporacion;
    }
}
