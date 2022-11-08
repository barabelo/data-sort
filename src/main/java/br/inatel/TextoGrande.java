package br.inatel;

import br.inatel.estrategia_de_ordenacao.implementacao.EstrategiaMergeSort;

public class TextoGrande extends Texto {
    public TextoGrande() {
        estrategiaDeOrdenacao = new EstrategiaMergeSort();
    }
}
