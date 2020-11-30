package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc37 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        for(int i=0; i< vetorA.length; i++){
            System.out.println("Entre com o valor ");
            vetorA[i] = scan.nextInt();
        }

        int guarda = 1;
        for(int i=0; i<vetorA.length; i++){

            System.out.print(vetorA[i] +"!" + " = " + (vetorB[i] = vetorA[i]) + "! ");

            while(vetorB[i]>i ){
                guarda *= vetorB[i];

                vetorB[i] = vetorA[i] - 1;

                if(vetorB[i] != 0){
                    System.out.print((vetorB[i]) + "! ");
                    vetorA[i] = vetorB[i];
                }
            }
            System.out.println("= " +guarda);

        }
    }
}
