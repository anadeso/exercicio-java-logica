package com.company.exercicios_aula13;

import java.util.Scanner;

public class LojaTinta {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tamanho em metross quadrados da area a ser pintada: ");
        int metroQuadradro = scan.nextInt();

        int qtd = (metroQuadradro / 3) / 18;
        double valor = qtd * 80;

        System.out.println("Precisará de " +qtd +  " latas de tintas"
                +   " e custará R$: " +valor);

}
    }