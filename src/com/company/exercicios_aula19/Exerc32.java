package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc32 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o vaor do A");
            vetorA[i] = scan.nextInt();
        }

        for(int i=0; i<vetorA.length; i++){

            int j=1;

            while (j<=10){
                System.out.println(j + "x" + vetorA[i] + " = " + (j * vetorA[i]) );
                j++;
            }
            System.out.println();
        }



    }
}
