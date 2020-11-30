package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc28 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor do vetor A");
            vetorA[i] = scan.nextInt();
        }

        for(int i=0; i<vetorA.length; i++){
            vetorB[9 - i] = vetorA[i];

        }

        System.out.println();
        System.out.println("Vetor A");
        for(int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
        System.out.println("Vetor B");
        for(int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}
