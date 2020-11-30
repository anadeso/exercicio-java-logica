package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc29 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[20];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o vlr do vetor A");
            vetorA[i] = scan.nextInt();
        }

        for(int i=0; i<vetorB.length; i++){
            System.out.println("Entre com o vlr do vetor B");
            vetorB[i] = scan.nextInt();

        }

        for(int i=0; i<vetorA.length; i++){
            vetorC[i] = vetorA[i];
            //vetorC[i] = vetorB[i];
        }

        for(int i=0; i<vetorB.length; i++){
            vetorC[i + 11 - 1] = vetorB[i];
            //vetorC[i] = vetorB[i];
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

        System.out.println();
        System.out.println("Vetor C");
        for(int i=0; i<vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
    }
}
