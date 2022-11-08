package br.inatel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Texto texto;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o texto que deseja ordenar:");
        String entrada = scanner.nextLine();
        if (entrada.length() < 10) {
            texto = new TextoPequeno();
        } else if (entrada.length() < 20) {
            texto = new TextoMedio();
        } else {
            texto = new TextoGrande();
        }
        String ordenado = texto.ordenar(entrada);
        System.out.println("Texto ordenado:");
        System.out.println(ordenado);
    }
}
