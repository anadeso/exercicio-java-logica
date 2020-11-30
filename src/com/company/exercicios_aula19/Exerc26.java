package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc26 {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor do vetor A na posicao " +(i+1));
            vetorA[i] = scan.nextInt();
        }

        for(int i=0; i<vetorB.length; i++){
            System.out.println("Entre com o valor do vetor B na posicao " +(i+1));
            vetorB[i] = scan.nextInt();
        }

        for(int i=0; i<vetorA.length; i++){
            if(vetorA[i] >vetorB[i]){
                vetorC[i] = 1;
            } else if(vetorA[i] == vetorB[i]){
                vetorC[i] = 0;
            } else{
                vetorC[i] = -1;
            }

        }
        System.out.println("Vetor C");
        for(int vetor : vetorC){
            System.out.print(vetor + " ");
        }
    }
}
