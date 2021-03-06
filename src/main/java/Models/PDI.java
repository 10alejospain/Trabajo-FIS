package Models;

import Interfaces.IPDI;
public class PDI extends Observador implements IPDI{
  private String codigoTrabajador;
  private String categoria;
  private String horarioTrabajo;

    public PDI(String nombre, String primerApellido, String segundoApellido, String correo, String contraseña, String dni, String codigoTrabajador, String categoria, String horarioTrabajo) {
        super(nombre,primerApellido,segundoApellido,correo,contraseña,dni);
        this.codigoTrabajador = codigoTrabajador;
        this.categoria = categoria;
        this.horarioTrabajo = horarioTrabajo;
    }

    public String getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(String codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }



    public String getCategoria() {
        return categoria;
    }



    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }



    @Override
    public String toString(){
        return super.toString() + "\nCodigo de trabajador: "+ codigoTrabajador+ "\nCategoria: " + categoria + "\nString: " + horarioTrabajo;
    }
}
