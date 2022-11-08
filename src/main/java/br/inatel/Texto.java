package br.inatel;

public abstract class Texto {
    protected EstrategiaDeOrdenacao estrategiaDeOrdenacao;

    public String ordenar(String texto) {
        return estrategiaDeOrdenacao.ordenarPalavrasDoTexto(texto);
    }

    public EstrategiaDeOrdenacao getEstrategiaDeOrdenacao() {
        return estrategiaDeOrdenacao;
    }
}
