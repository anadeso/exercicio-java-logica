package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor no vetor A");
            vetorA[i] = scan.nextInt();
        }

        for(int i=0; i<vetorA.length; i++){

            if(vetorA[i] < 7){
                vetorB[i] = 'a';
            }else if(vetorA[i] == 7){
                vetorB[i] = 'b';
            }else if(vetorA[i] > 7 && vetorA[i] <10){
                vetorB[i] = 'c';
            }else if(vetorA[i] == 10){
                vetorB[i] = 'd';
            }else if(vetorA[i] > 10){
                vetorB[i] = 'e';
            }
        }
        System.out.println();
        System.out.println("Vetor A");

        for(int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
        System.out.println("Vetor B");

        for(int i=0; i<vetorB.length; i++){
            // Saida tabela ASC
            System.out.print(vetorB[i] + " ");
        }
    }
}
