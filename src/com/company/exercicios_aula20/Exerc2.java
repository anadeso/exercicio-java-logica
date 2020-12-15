package com.company.exercicios_aula20;

import java.util.Random;

public class Exerc2 {

    public static void main(String[] args) {

        int[][] valores = new int[10][10];

        Random random = new Random();

        int maior = 0;
        int menor = 101;
        int menor5 = 101;
        int maior5 = 0;
        int linha = 0;
        int coluna = 0;
        int aux = 0;

        for(int i=0; i<valores.length; i++){
            for(int j=0; j<valores[i].length; j++){

                valores[i][j] = random.nextInt(100);

            }
        }
        for(int i=0; i<valores.length; i++){
            for(int j=0; j<valores[i].length; j++){

                if(i == 4){
                    if(valores[i][j] > maior) {
                        maior = valores[i][j];
                    }
                    if(valores[i][j] < menor){
                        menor = valores[i][j];
                    }
                }

                if(j == 6){
                    //menor5 = valores[i][j];
                    if(valores[i][j] < menor5){
                        menor5 = valores[i][j];
                    }

                    if(valores[i][j] > maior5){
                        maior5 = valores[i][j];
                    }
                }

            }
        }

        for(int i=0; i<valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                System.out.print(valores[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Maior referente a linha 5 " +maior);
        System.out.println("Menor referente a linha 5 " +menor);

        System.out.println("Menor referente a coluna 7 " +menor5);
        System.out.println("Maior referente a coluna 7 " +maior5);

    }

}
