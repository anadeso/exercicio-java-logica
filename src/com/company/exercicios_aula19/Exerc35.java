package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc35 {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        int[] vetorA = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor de vetor A " +vetorA[i]);
            vetorA[i] = scan.nextInt();
        }

        for(int i=0; i<vetorA.length; i++){

            System.out.println("Divisor de " +vetorA[i]);
            for(int j=1; j<=vetorA[i]; j++){

                if(vetorA[i] % j == 0){
                    System.out.println( " é "
                    +j);

                }
            }
            System.out.println();
        }







    }
}
