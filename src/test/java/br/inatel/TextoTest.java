package br.inatel;

import br.inatel.estrategia_de_ordenacao.implementacao.EstrategiaBubbleSort;
import br.inatel.estrategia_de_ordenacao.implementacao.EstrategiaInsertionSort;
import br.inatel.estrategia_de_ordenacao.implementacao.EstrategiaMergeSort;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TextoTest {
    private Texto texto;
    private static String textoDesordenado;
    private static String textoOrdenado;

    @BeforeClass
    public static void setUp() {
        textoDesordenado = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        textoOrdenado = "adipiscing amet, consectetur dolor elit. ipsum Lorem sit";
    }

    @Test
    public void textoPequenoTest() {
        texto = new TextoPequeno();
        assertTrue(texto.getEstrategiaDeOrdenacao() instanceof EstrategiaInsertionSort);
    }

    @Test
    public void ordenarTextoPequenoTest() {
        texto = new TextoPequeno();
        String ordenado = texto.ordenar(textoDesordenado);
        assertEquals(textoOrdenado, ordenado);
    }

    @Test
    public void textoMedioTest() {
        texto = new TextoMedio();
        assertTrue(texto.getEstrategiaDeOrdenacao() instanceof EstrategiaBubbleSort);
    }

    @Test
    public void ordenarTextoMedioTest() {
        texto = new TextoMedio();
        String ordenado = texto.ordenar(textoDesordenado);
        assertEquals(textoOrdenado, ordenado);
    }

    @Test
    public void textoGrandeTest() {
        texto = new TextoGrande();
        assertTrue(texto.getEstrategiaDeOrdenacao() instanceof EstrategiaMergeSort);
    }

    @Test
    public void ordenarTextoGrandeTest() {
        texto = new TextoGrande();
        String ordenado = texto.ordenar(textoDesordenado);
        assertEquals(textoOrdenado, ordenado);
    }
}