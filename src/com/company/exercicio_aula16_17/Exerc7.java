package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc7 {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        int numero;
        int maior = Integer.MIN_VALUE;

        for(int i = 1; i <= 5; i++){

            System.out.println("Informe o numero");
            numero = scan.nextInt();

            if(numero >maior){
                maior = numero;
                System.out.println("O numero maior mudou" +numero);
            }

        }

        System.out.println("O numero maior é: " +maior);

    }
}
