package br.inatel.estrategia_de_ordenacao.implementacao;

import br.inatel.EstrategiaDeOrdenacao;

public class EstrategiaInsertionSort implements EstrategiaDeOrdenacao {
    @Override
    public String ordenarPalavrasDoTexto(String texto) {
        String[] palavras = texto.trim().split("\\s+");
        for (int i = 0; i < palavras.length; ++i) {
            int j = i;
            while (j > 0 && palavras[j - 1].toLowerCase().compareTo(palavras[j].toLowerCase()) > 0) {
                String chave = palavras[j];
                palavras[j] = palavras[j - 1];
                palavras[j - 1] = chave;
                j = j - 1;
            }
        }
        return String.join(" ", palavras);
    }
}
