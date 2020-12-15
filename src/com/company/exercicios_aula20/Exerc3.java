package com.company.exercicios_aula20;

import java.util.Scanner;

public class Exerc3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] valores = new int[3][3];

        for(int i=0; i<valores.length; i++){
            for(int j=0; j<valores[i].length; j++){
                System.out.println("Entre com o valores " +(j+1));
                valores[i][j] = scan.nextInt();
            }
        }

        int pares = 0;
        int impares = 0;
        for(int i= 0; i<valores.length; i++){
            for(int j=0; j<valores[i].length; j++){

                if(valores[i][j] % 2 == 0){
                    pares++;
                } else{
                    impares++;
                }
            }
        }

        System.out.println("Numero pares " +pares);
        System.out.println("Numero impares " +impares);
    }
}
