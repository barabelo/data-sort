package br.inatel.estrategia_de_ordenacao.implementacao;

import br.inatel.EstrategiaDeOrdenacao;

public class EstrategiaBubbleSort implements EstrategiaDeOrdenacao {
    @Override
    public String ordenarPalavrasDoTexto(String texto) {
        String[] palavras = texto.trim().split("\\s+");
        String aux;
        for (int i = 0; i < palavras.length; ++i) {
            for (int j = i; j < palavras.length; ++j) {
                if (palavras[i].toLowerCase().compareTo(palavras[j].toLowerCase()) > 0) {
                    aux = palavras[i];
                    palavras[i] = palavras[j];
                    palavras[j] = aux;
                }
            }
        }
        return String.join(" ", palavras);
    }
}
