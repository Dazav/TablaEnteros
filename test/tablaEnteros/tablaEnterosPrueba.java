import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class tablaEnterosPrueba {
    private tablaEnteros tabla;

    @Before
    public void setUp() {
        Integer[] elementos = {1, 2, 3, 4, 5};
        tabla = new tablaEnteros(elementos);
    }

    @Test(expected = IllegalArgumentException.class)
    public void crearTablaConElementosNulosLanzaExcepcion() {
        tablaEnteros tablaNula = new tablaEnteros(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void crearTablaSinElementosLanzaExcepcion() {
        Integer[] elementos = {};
        tablaEnteros tablaVacia = new tablaEnteros(elementos);
    }

    @Test
    public void sumaTablaDebeRetornarLaSumaCorrecta() {
        int suma = tabla.sumaTabla();
        Assert.assertEquals(15, suma);
    }
}
