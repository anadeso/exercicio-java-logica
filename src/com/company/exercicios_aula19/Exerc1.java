package com.company.exercicios_aula19;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Exerc1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = vetorA;


        for(int i=0; i<vetorA.length; i++){

            System.out.println("Entre com o valor da posição "+i);

            vetorA[i] = scan.nextInt();
           // vetorB[i] = vetorA[i];

        }

        System.out.println("Vetor A = ");
        for(int i=0; i<vetorA.length; i++){

            System.out.println("O valor do vetorA na posicao " + (i+1) + " é " + vetorA[i]);
        }
        System.out.println();

        System.out.println("Vetor B = ");
        for(int i=0; i<vetorB.length; i++){
            System.out.println("O valor do vetor B na posicao " + (i+1) + " é "+ vetorB[i]);
        }
    }
}
