package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for(int i=0; i<vetorA.length; i++){

            System.out.println("Entre com o valor da idade na posicao " + (i+1));
            vetorA[i] = scan.nextInt();

        }

        int qtdIdadeSup = 0;
        for(int i=0; i<vetorA.length; i++){

            if(vetorA[i] > 35){
                qtdIdadeSup++;
            }
        }

        System.out.println();
        for(int vetor : vetorA){
            System.out.print(vetor);
        }
        System.out.println();

        System.out.println("Quantidade idade superior a 25 é: " +qtdIdadeSup);
    }
}
