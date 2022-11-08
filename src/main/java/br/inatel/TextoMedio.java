package br.inatel;

import br.inatel.estrategia_de_ordenacao.implementacao.EstrategiaBubbleSort;

public class TextoMedio extends Texto {
    public TextoMedio() {
        estrategiaDeOrdenacao = new EstrategiaBubbleSort();
    }
}
