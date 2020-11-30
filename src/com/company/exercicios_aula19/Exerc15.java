package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor do vetor A da posicao " +(i+1));
            vetorA[i] = scan.nextInt();
        }
        int qtdPar = 0;
        int qtdImpar = 0;
        int qtdTotal = 0;
        double mediaPar;
        double mediaImpar;

        for(int i=0; i<vetorA.length; i++){

            qtdTotal++;

            if(vetorA[i] % 2 == 0){
                qtdPar++;
            }else{
                qtdImpar++;
            }
        }

        mediaPar = (qtdPar * 100) / vetorA.length;
        mediaImpar = (qtdImpar * 100) / vetorA.length;

        System.out.println();
        System.out.println("Vetor A: ");
        for(int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("Porcentagem pares " +mediaPar);
        System.out.println("Porcentagem impar " +mediaImpar);
    }
}
