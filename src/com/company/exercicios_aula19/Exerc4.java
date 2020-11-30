package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[15];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor na posição " +i);
            vetorA[i] = scan.nextInt();

            vetorB[i] =  Math.sqrt(vetorA[i]);

        }

        System.out.println("Vetor A");
        for(int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("Vetor B");
        for(int i=1; i<vetorB.length; i++){
            System.out.print(i + " = " + vetorB[i] + " ");
        }
    }
}
