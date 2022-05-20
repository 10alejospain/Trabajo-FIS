package Models;

import Interfaces.IUsuario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTests extends Usuario {

    private Alumno alumno;
    private final String nombre = "Pepe";
    private final String primerApellido = "Viyuela";
    private final String segundoApellido = "Castillo";
    private final String correo = "pepeviyuelamolon@alumnos.upm.es";
    private final String contrasena = "superSegUra144Hz";
    private final String dni= "81237142X";
    private final String numeroMatricula = "ba0006";
    @BeforeEach
    void setUp() {
        this.alumno = new Alumno(this.nombre,
                this.primerApellido,
                this.segundoApellido,
                this.correo,
                this.contrasena,
                this.dni,
                this.numeroMatricula);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void testGetNombre() {
        assertEquals(this.nombre, this.alumno.getNombre());
    }

    @Test
    void testSetNombre() throws NoSuchFieldException, IllegalAccessException {
        String nuevoNombre = "Jose";

        this.alumno.setNombre(nuevoNombre);

        assertEquals(nuevoNombre, this.alumno.getNombre());
    }

    @Test
    void testGetPrimerApellido() {
        assertEquals(this.primerApellido, this.alumno.getPrimerApellido());
    }

    @Test
    void testSetPrimerApellido() {
        String nuevoPrimerApellido = "Viyuelooo";

        this.alumno.setPrimerApellido(nuevoPrimerApellido);

        assertEquals(nuevoPrimerApellido, this.alumno.getPrimerApellido());
    }

    @Test
    void testGetSegundoApellido() {
        assertEquals(this.segundoApellido, this.alumno.getSegundoApellido());
    }

    @Test
    void testSetSegundoApellido() {
        String nuevoSegundoApellido = "Caraalmendra";

        this.alumno.setSegundoApellido(nuevoSegundoApellido);

        assertEquals(nuevoSegundoApellido, this.alumno.getSegundoApellido());
    }

    @Test
    void testGetCorreo() {
        assertEquals(this.correo, this.alumno.getCorreo());
    }

    @Test
    void testSetCorreo() {
        String nuevoCorreo = "pepemolon@alumnos.upm.es";

        this.alumno.setCorreo(nuevoCorreo);

        assertEquals(nuevoCorreo, this.alumno.getCorreo());
    }

    @Test
    void testGetContraseña() {
        assertEquals(this.contrasena, this.alumno.getContraseña());
    }

    @Test
    void testSetContraseña() {
        String nuevaPass = "1234";

        this.alumno.setContraseña(nuevaPass);

        assertEquals(nuevaPass, this.alumno.getContraseña());
    }

    @Test
    void testGetDNI() {
        assertEquals(this.dni, this.alumno.getDNI());
    }

    @Test
    void testSetDni() {
        String nuevoDNI = "12341233P";

        this.alumno.setDni(nuevoDNI);

        assertEquals(nuevoDNI, this.alumno.getDNI());
    }


    @Test
    void getNumeroMatricula() {
        assertEquals(this.numeroMatricula, this.alumno.getNumeroMatricula());
    }

    @Test
    void setNumeroMatricula() {

        String nuevaMatricula = "zo1234";

        this.alumno.setNumeroMatricula(nuevaMatricula);

        assertEquals(nuevaMatricula, this.alumno.getNumeroMatricula());
    }

    /**
     * Este metodo comprueba el .toString() de la clase Usuario,
     * casteando el Alumno actual que tenemos en pruebas a Usuario.
     */
    @Test
    void testToStringUsuario() {
        String resultado = "Nombre: " + this.nombre + "\nApellidos: "+ this.primerApellido + " " + this.segundoApellido
                + "\nCorreo: " + this.correo + "\nDNI"+ this.dni ;
        Usuario alumnoAsUsuario = new Usuario(
                this.alumno.getNombre(),
                this.alumno.getPrimerApellido(),
                this.alumno.getSegundoApellido(),
                this.alumno.getCorreo(),
                this.alumno.getContraseña(),
                this.alumno.getDNI());
        assertEquals(alumnoAsUsuario.toString(), resultado);
    }

    @Test
    void testToStringAlumno() {
        String resultado = "Nombre: " + this.nombre + "\nApellidos: "+ this.primerApellido + " " + this.segundoApellido
                + "\nCorreo: " + this.correo + "\nDNI"+ this.dni + "\nNumero Matricula: " + numeroMatricula + "\n";

        assertEquals(this.alumno.toString(), resultado);
    }

}