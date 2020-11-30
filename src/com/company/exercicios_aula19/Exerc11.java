package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;

        for(int i=0; i<vetorA.length; i++){

            System.out.println("Entre com o valor no vetor na posicao " +(i+1));
            vetorA[i] = scan.nextInt();


        }

        System.out.println();
        System.out.print("Sao numeros pares: ");
        for(int i=0; i<vetorA.length; i++){

            if(vetorA[i] % 2 == 0){
                soma++;
                //System.out.println("Soma de pares: " +soma);
                System.out.print(vetorA[i] + " ");
            }

        }
        System.out.println("Soma de pares: " +soma);

    }
}
