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

    @Test
    public void mayorTablaDebeRetornarElMayorElemento() {
        int mayor = tabla.mayorTabla();
        Assert.assertEquals(5, mayor);
    }

    @Test
    public void posicionTablaDebeRetornarLaPosicionCorrecta() {
        int posicion = tabla.posicionTabla(3);
        Assert.assertEquals(2, posicion);
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void posicionTablaConElementoNoExistenteLanzaExcepcion() {
        tabla.posicionTabla(6);
    }
}
