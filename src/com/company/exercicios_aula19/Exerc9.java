package com.company.exercicios_aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor do vetor A na posição " + (i+1) + " :");
            vetorA[i] = scan.nextInt();
        }

        for(int i=0; i<vetorB.length; i++){
            System.out.println("Entre com o valor do vetor B na posicao " +(i+1) + " :");
            vetorB[i] = scan.nextInt();
        }

        /*for(int i=0; i<vetorC.length; i++){
            vetorC[i] = vetorA[i] / vetorB[i];
        }*/

        System.out.println();
        System.out.println("Vetor A: ");
        for(int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
        System.out.println("Vetor B: ");
        for(int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

        //DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.println();
        System.out.println("Vetor C: ");
        for(int i=0; i<vetorC.length; i++){
            vetorC[i] = vetorA[i] / vetorB[i];
            System.out.print(vetorC[i] + " ");
        }

    }
}
