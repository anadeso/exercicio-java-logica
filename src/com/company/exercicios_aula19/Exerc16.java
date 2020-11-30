package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posicao " +(i+1));
            vetorA[i] = scan.nextInt();
        }

        int somaInf15=0;
        int somaMaior15=0;
        int qtdIguais15 = 0;
        int qtdMaior15 = 0;
        int media;
        for(int i=0; i<vetorA.length; i++){

            if(vetorA[i] < 15){
                somaInf15 +=vetorA[i];
            }

            if(vetorA[i] == 15){
                qtdIguais15++;
            }

            if(vetorA[i] > 15){
                somaMaior15 +=vetorA[i];
                qtdMaior15++;
            }
        }
        System.out.println();
        System.out.println("Soma elementos armazenados no vetor inferior a 15 é: " +somaInf15);
        System.out.println("A quantidade de elementos que sao iguais a 15 sao: " +qtdIguais15);

        System.out.println();
        media = (somaMaior15 /qtdMaior15);
        System.out.println("A media dos elementos armazenados superior a 15: " +media);


    }
}
