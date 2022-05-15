package Models;

import Interfaces.IPDI;
public class PDI extends Usuario implements IPDI{
  private int codigoTrabajador;
  private String categoria;
  private String horarioTrabajo;

    public PDI(String nombre, String primerApellido, String segundoApellido, String correo, String contraseña, String dni, int codigoTrabajador, String categoria, String horarioTrabajo) {
        super(nombre,primerApellido,segundoApellido,correo,contraseña,dni);
        this.codigoTrabajador = codigoTrabajador;
        this.categoria = categoria;
        this.horarioTrabajo = horarioTrabajo;
    }

    public int getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(int codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    @Override
    public Integer getCodigo_Trabajadorl() {
        return null;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String getHorario_Trabajol() {
        return null;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }

    public PDI(int codigoTrabajador, String categoria, String horarioTrabajo) {
        this.codigoTrabajador = codigoTrabajador;
        this.categoria = categoria;
        this.horarioTrabajo = horarioTrabajo;
    }

    @Override
    public String toString(){
        return super.toString() + "\nCodigo de trabajador: "+ codigoTrabajador+ "\nCategoria: " + categoria + "\nString: " + horarioTrabajo;
    }
}
