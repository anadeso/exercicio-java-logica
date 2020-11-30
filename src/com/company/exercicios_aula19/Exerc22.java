package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for(int i=0; i<vetorA.length; i++){
            vetorA[i] = (int) Math.round(Math.random() *1);
        }

        for(int vetor : vetorA){
            System.out.println(vetor+ " ");
        }

        int qtdZero=0;
        int qtdUm=0;
        double porcentagemZero;
        double porcentagemUm;
        for(int i=0; i<vetorA.length; i++){

            if(vetorA[i] == 0){
                qtdZero++;
            }else{
                qtdUm++;
            }
        }

        System.out.println("Porcentagem zero: " +(porcentagemZero = (qtdZero * 100)/vetorA.length));
        System.out.println("Porcentagem um: " +(porcentagemUm = (qtdUm * 100)/vetorA.length));
    }
}
