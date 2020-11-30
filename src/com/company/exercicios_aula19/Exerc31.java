package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc31 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB= new  int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com valor vetor A");
            vetorA[i]= scan.nextInt();
        }

        int posB = 0;
        for(int i=0; i<vetorA.length; i++){

            if(vetorA[i] % 2 ==0){
                vetorB[posB] = vetorA[i];
                posB++;
            }

        }

        for(int i=0; i<vetorA.length; i++){

            if(vetorA[i] % 2 != 0){
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }

        System.out.println();
        System.out.println("Vetor B");
        for(int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

    }
}
