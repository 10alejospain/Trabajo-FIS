package Models;
import Interfaces.IUsuario;
public class Alumno extends Usuario implements IUsuario{
    private String numeroMatricula;

    public Alumno(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    
    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String getDNI() {
        return super.getDni();
    }

    @Override
    public String toString(){
        return  super.toString() + "\nNumero Matricula: " + numeroMatricula + "\n";
    }
}
