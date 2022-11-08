package br.inatel;

import br.inatel.estrategia_de_ordenacao.implementacao.EstrategiaInsertionSort;

public class TextoPequeno extends Texto {
    public TextoPequeno() {
        estrategiaDeOrdenacao = new EstrategiaInsertionSort();
    }
}
