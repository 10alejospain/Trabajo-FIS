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

    public PAS(int codigoPersonal, int añoIncorporacion) {
        this.codigoPersonal = codigoPersonal;
        this.añoIncorporacion = añoIncorporacion;
    }

    public Integer getCodigo_Personal() {
        return null;
    }

    public Integer getAño_Incorporacion() {
        return null;
    }

    @Override
    public String toString(){
        return super.toString() + "Codigo Personal: " + codigoPersonal + "Año de Incorporacion: "+ añoIncorporacion;
    }
}
