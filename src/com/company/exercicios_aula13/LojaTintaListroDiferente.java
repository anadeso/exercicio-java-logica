package com.company.exercicios_aula13;

import java.util.Scanner;

public class LojaTintaListroDiferente {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o metro quadrado a ser pintada");
        double metroASerPintado = scan.nextDouble();

        double litro = metroASerPintado / 6;
        double lata = Math.round(litro / 18);
        double galao = Math.round(litro / 3.6);

        double lata_baixo = Math.floor(lata);

        // 18 litros - lata
        double latas_subtrair = lata_baixo * 18;
        double resto = litro - latas_subtrair;

        // 3.6 - galao
        double galoes_resto = Math.round(resto / 3.6);

        // Preco
        double preco_galao_rest = galoes_resto * 25;
        double preco_lata_baixo = lata_baixo * 80;
        double preco_total_misturado = preco_lata_baixo + preco_galao_rest;

        double preco_lata = lata * 80;
        double preco_galao = galao * 25;

        System.out.println("1: Latas: " +lata + " / Preco: " +preco_lata);
        System.out.println("2: Galao: " +galao + " / Preco: " +preco_galao);
        System.out.println("3: Latas: " +lata_baixo + " / Galoes: " +galoes_resto + "/ Preco: " +preco_total_misturado);

    }
}
