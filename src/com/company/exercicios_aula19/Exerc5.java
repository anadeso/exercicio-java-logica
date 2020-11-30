package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for(int i=0; i<vetorA.length; i++){

            System.out.println("Entre com o valor da posição " +(i+1));
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * i;
        }

        System.out.println("Vetor A = ");
        for(int vetor : vetorA){
            System.out.print(" " +vetor);
        }

        System.out.println();
        for(int vetor : vetorB){
            System.out.print(" " + vetor);
        }
    }
}
