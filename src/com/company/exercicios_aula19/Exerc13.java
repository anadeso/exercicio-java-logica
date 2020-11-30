package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor do vetor A na posicao: " +(i+1));
            vetorA[i] = scan.nextInt();
        }

        int soma=0;
        for(int i=0; i<vetorA.length; i++){
           // Multiplo de 5 - resto divisao igual a zero
            if(vetorA[i] % 5 == 0){
                soma +=vetorA[i];
            }
        }
        System.out.print("Vetor A: ");
        for(int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
        System.out.println(soma + " ");

    }
}
