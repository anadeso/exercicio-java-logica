package com.company.exercicio_aula14_aula15;

import java.util.Scanner;

public class Exerc18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero inteiro");

        int numero = scan.nextInt();

        int parOuImpar = (numero%2);

        if(parOuImpar == 0){
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }

    }
}
