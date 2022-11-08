package br.inatel;

public abstract class Texto {
    protected EstrategiaDeOrdenacao estrategiaDeOrdenacao;

    public String ordenar(String texto) {
        String[] palavras = texto.trim().split("\\s+");
        String[] palavrasOrdenadas = estrategiaDeOrdenacao.ordenarPalavras(palavras);
        return String.join(" ", palavrasOrdenadas);
    }

    public EstrategiaDeOrdenacao getEstrategiaDeOrdenacao() {
        return estrategiaDeOrdenacao;
    }
}
