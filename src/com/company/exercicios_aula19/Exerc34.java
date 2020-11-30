package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc34 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for(int i=0; i<vetorA.length; i++){

            System.out.println("Entre com o valor ");
            vetorA[i] = scan.nextInt();
        }


        for(int i=0; i<vetorA.length; i++){

            System.out.println("Analizando ate o numero os pares " +vetorA[i]);

            for(int j=2; j<vetorA[i]; j++){

                if (j % 2 == 0){
                    System.out.println(j + " é par");
                }
            }

            System.out.println();
        }


    }
}
