package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor do vetor A na posição " + (i+1));
            vetorA[i] = scan.nextInt();
        }

        for(int i=0; i<vetorB.length; i++){
            System.out.println("Entre com o valor do vetor B na posicao " + (i+1));
            vetorB[i] =scan.nextInt();
        }

        System.out.println();
        System.out.println("Valor vetor A");
        for(int i=0; i<vetorA.length; i++){
            System.out.print(" " + vetorA[i]);
        }

        System.out.println();
        System.out.println("Valor vetor B");
        for(int i=0; i<vetorB.length; i++){
            System.out.print(" " + vetorB[i]);
        }

        System.out.println();
        System.out.println("Valor vetor C: ");
        for(int i=0; i<vetorC.length; i++){
            vetorC[i] = vetorA[i] - vetorB[i];
            System.out.print(" " +vetorC[i]);
        }
    }
}
