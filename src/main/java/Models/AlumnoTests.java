package Models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTests extends Usuario {

    private Alumno alumno;
    private String nombre = "Pepe";
    private String primerApellido = "Viyuela";
    private String segundoApellido = "Castillo";
    private String correo = "pepeviyuelamolon@alumnos.upm.es";
    private String contrasena = "superSegUra144Hz";
    private String dni= "81237142X";
    private String numeroMatricula = "ba0006";
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
    void testSetNombre() {
        String nuevoNombre = "Jose";

    }

    @Test
    void testGetPrimerApellido() {
        assertEquals(this.primerApellido, this.alumno.getPrimerApellido());
    }

    @Test
    void testSetPrimerApellido() {
    }

    @Test
    void testGetSegundoApellido() {
        assertEquals(this.segundoApellido, this.alumno.getSegundoApellido());
    }

    @Test
    void testSetSegundoApellido() {
    }

    @Test
    void testGetCorreo() {
        assertEquals(this.correo, this.alumno.getCorreo());
    }

    @Test
    void testSetCorreo() {
    }

    @Test
    void testGetContraseña() {
        assertEquals(this.contrasena, this.alumno.getContraseña());
    }

    @Test
    void testSetContraseña() {
    }

    @Test
    void testGetDni() {
        assertEquals(this.dni, this.alumno.getDni());
    }

    @Test
    void testSetDni() {
    }

    @Test
    void testToString() {
    }

    @Test
    void getNumeroMatricula() {
        assertEquals(this.numeroMatricula, this.alumno.getNumeroMatricula());
    }

    @Test
    void setNumeroMatricula() {
    }

    @Test
    void testGetDNI1() {
        //assertEquals(this.dni, this.alumno.get());
    }

    @Test
    void testToString1() {
    }
}