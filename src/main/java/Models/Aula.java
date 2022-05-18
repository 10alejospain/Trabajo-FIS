package Models;

import Interfaces.IAula;

public class Aula implements IAula {
  private String id;
  private String centro;
  private int numeroCentro;
  private Double superficie;
  private int aforo;
  private String tipo;


  public Aula(String id, String centro, int numeroCentro, Double superficie, int aforo, String tipo) {
    this.id = id;
    this.centro = centro;
    this.numeroCentro = numeroCentro;
    this.superficie = superficie;
    this.aforo = aforo;
    this.tipo = tipo;
  }

  public String getId() {return id;}

  public void setId(String id) {
    this.id = id;
  }

  public String getCentro() {
    return centro;
  }

  public int getNumero_Centro() {return numeroCentro;}

  public void setCentro(String centro) {
    this.centro = centro;
  }

  public int getNumeroCentro() {
    return numeroCentro;
  }

  public void setNumeroCentro(int numeroCentro) {
    this.numeroCentro = numeroCentro;
  }

  public Double getSuperficie() {
    return superficie;
  }

  public void setSuperficie(Double superficie) {
    this.superficie = superficie;
  }

  public int getAforo() {
    return aforo;
  }

  public void setAforo(int aforo) {
    this.aforo = aforo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}
