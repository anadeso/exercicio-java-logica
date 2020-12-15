package com.company.exercicios_aula20;

import java.util.Random;
import java.util.Scanner;

public class Exerc1 {

    public static void main(String[] args) {

        int[][] valores = new int[4][4];

        Random numRandom = new Random();

        for(int i=0; i<valores.length; i++){
            for(int j=0; j<valores[i].length; j++){
                valores[i][j] = numRandom.nextInt(100);
            }
        }

        System.out.print(" ");
        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for(int i=0; i<valores.length; i++){
            for(int j=0; j<valores[i].length; j++){

                if(valores[i][j] > maior){
                    maior = valores[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        for(int i=0; i<valores.length; i++){
            for(int j=0; j<valores[i].length; j++){
                System.out.print(valores[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println("Maior valor = " +maior);
        System.out.println("Linha = " +linha);
        System.out.println("Coluna = " +coluna);
    }
}
