package com.company.exercicios_aula19;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Exerc8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor do vetor A da posição " + (i+1) + " :");
            vetorA[i] = scan.nextInt();
        }

        for(int i=0; i<vetorB.length; i++){
            System.out.println("Entre com o valor do vetor B da posicao " + (i+1) + " :");
            vetorB[i] = scan.nextInt();
        }

        System.out.println();

        System.out.println("O valor do vetor A ");
        for(int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("O valor do vetor B ");
        for(int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

        System.out.println();

        System.out.println("O valor do vetor C");
        for(int i=0; i<vetorC.length; i++){
            vetorC[i] = vetorA[i] * vetorB[i];

            System.out.print(vetorC[i] + " ");
        }


    }
}
