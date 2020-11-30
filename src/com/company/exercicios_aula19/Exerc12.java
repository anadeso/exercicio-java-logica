package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for(int i=0; i<vetorA.length; i++){

            System.out.println("Entre com o valor do vetor A da posicao "+(i+1));
            vetorA[i] = scan.nextInt();
        }

        int soma = 0;
        for(int i=0; i<vetorA.length; i++){
            soma +=vetorA[i];
        }
        System.out.println("A soma " +soma);

    }
}
