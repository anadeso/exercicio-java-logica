package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor do vetor A da posicao " + (i+1));
            vetorA[i] = scan.nextInt();
        }
        //1221
       // i =0 -> 1
       // i=1 ->2

        boolean palindromo = true;
        for(int i=0; i<(vetorA.length/2); i++){

            if(vetorA[i] != vetorA[vetorA.length -1 -i]){
                palindromo = false;
                break;
            }

        }
        System.out.println("Vetor A");
        for(int i=0; i<vetorA.length; i++){
            System.out.println(vetorA[i]);
        }

        System.out.println();
        if(palindromo){
            System.out.println("É Palindromo");
        }else{
            System.out.println("Nao é palindromo");
        }
    }
}
