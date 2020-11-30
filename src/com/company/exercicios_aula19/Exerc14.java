package com.company.exercicios_aula19;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Exerc14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor do vetor A da posicao " + (i+1));
            vetorA[i] = scan.nextInt();
        }

        int qtd = 0;
        int soma = 0;
        double media;
        for(int i=0; i<vetorA.length; i++){

            if(vetorA[i] % 2 !=  0){
                qtd++;
                soma += vetorA[i];
            }

        }

        System.out.println();
        System.out.println(soma);
        System.out.println("Vetor A: ");
        for(int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
        media = soma/qtd;
        System.out.println(media);
    }
}
