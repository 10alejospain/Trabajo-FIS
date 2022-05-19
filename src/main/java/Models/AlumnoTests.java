package Models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

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
    void testGetDni() {
        assertEquals(this.dni, this.alumno.getDni());
    }

    @Test
    void testSetDni() {
        String nuevoDNI = "12341233P";

        this.alumno.setDni(nuevoDNI);

        assertEquals(nuevoDNI, this.alumno.getDni());
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

        String nuevaMatricula = "zo1234";

        this.alumno.setNumeroMatricula(nuevaMatricula);

        assertEquals(nuevaMatricula, this.alumno.getNumeroMatricula());
    }

    @Test
    void testGetDNI1() {
        //assertEquals(this.dni, this.alumno.get());
    }

    @Test
    void testToStringUsuario() {
        String resultado = "";
        assertEquals(this.alumno.toString(), resultado);
    }
}