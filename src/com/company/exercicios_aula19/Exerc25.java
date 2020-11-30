package com.company.exercicios_aula19;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Exerc25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com valor do vetor A na posicao " +(i+1));
            vetorA[i] = scan.nextInt();
        }

        for(int i=0; i<vetorA.length; i++){
            vetorB[i] = (vetorA[i] % 2) == 0 ? 1 : 0;
        }

        System.out.println();
        System.out.println("Vetor B");
        for(int vetor : vetorB){
            System.out.println(vetor + " ");
        }
    }
}
