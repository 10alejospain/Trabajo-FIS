package Models;
import Interfaces.*;
public class Usuario implements IAlumno{

  private String nombre;
  private String primerApellido;
  private String segundoApellido;
  private String correo;
  private String contraseña;
  private String dni;

  public Usuario(){

  }
  public Usuario(String nombre, String primerApellido, String segundoApellido, String correo, String contraseña, String dni) {
    this.nombre = nombre;
    this.primerApellido = primerApellido;
    this.segundoApellido = segundoApellido;
    this.correo = correo;
    this.contraseña = contraseña;
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getPrimerApellido() {
    return primerApellido;
  }

  public void setPrimerApellido(String primerApellido) {
    this.primerApellido = primerApellido;
  }

  public String getSegundoApellido() {
    return segundoApellido;
  }

  public void setSegundoApellido(String segundoApellido) {
    this.segundoApellido = segundoApellido;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getContraseña() {
    return contraseña;
  }

  public void setContraseña(String contraseña) {
    this.contraseña = contraseña;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }


  public String getNumero_Matricula() {
    return null;
  }

  @Override
  public String toString(){
    return "Nombre: " + nombre + "\nApellidos: "+ primerApellido + " " + segundoApellido + "\nCorreo: " + correo + "\nDNI"+ dni ;
  }
}
