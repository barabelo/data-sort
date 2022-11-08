package br.inatel.estrategia_de_ordenacao.implementacao;

import br.inatel.EstrategiaDeOrdenacao;

public class EstrategiaMergeSort implements EstrategiaDeOrdenacao {
    @Override
    public String ordenarPalavrasDoTexto(String texto) {
        String[] palavras = texto.trim().split("\\s+");
        sort(palavras, 0, palavras.length - 1);
        return String.join(" ", palavras);
    }

    void sort(String[] arr, int l, int r) {
        if (l < r) {
            // Encontrar o ponto médio.
            int m = l + (r - l) / 2;

            // Ordenar a primeira e segunda metades.
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Mesclar (merge) as metades ordenadas.
            merge(arr, l, m, r);
        }
    }

    void merge(String[] arr, int l, int m, int r) {
        // Encontrar os tamanhos dos dois sub-arrays a serem unidos.
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Criação dos arrays temporários. */
        String[] L = new String[n1];
        String[] R = new String[n2];

        /* Cópia dos dados para os arrays temporários. */
        System.arraycopy(arr, l, L, 0, n1);
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Mesclagem (merge) dos arrays temporários */

        // Índices iniciais do primeiro e do segundo sub-array.
        int i = 0, j = 0;

        // Índice inicial do array que conterá a mescla dos sub-arrays.
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].toLowerCase().compareTo(R[j].toLowerCase()) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Cópia dos elementos restantes de L[], se houver algum. */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Cópia dos elementos restantes de R[], se houver algum. */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
