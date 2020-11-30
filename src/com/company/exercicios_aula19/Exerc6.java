package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Digite o valor do vetor A da posição  " + (i+1) + " : ");
            vetorA[i] = scan.nextInt();

            for(int j=0; j<vetorB.length; j++)  {
                System.out.println("Digite o valor do vetor B da posição " + (i+1) + " : ");
                vetorB[i] = scan.nextInt();
                break;
            }
        }

        System.out.println();

        System.out.println();
        for(int i=0; i<vetorC.length; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println();

        System.out.println("Vetor A");
        for(int i=0; i<vetorA.length; i++){
            System.out.print(" " +vetorA[i]);
        }

        System.out.println();

        System.out.println("Vetor B");
        for(int dadosVB: vetorB){
            System.out.print(" " +dadosVB);
        }

        System.out.println();

        System.out.println("Vetor C");
        for(int dadosVC :vetorC){
            System.out.print(" " +dadosVC);
        }

    }
}
