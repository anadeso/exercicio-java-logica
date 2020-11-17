package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc34 {

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero");
        int num = scan.nextInt();

        double soma = 0.0;

        for(int n=1; n<=num; n++){
           soma += 1/n;
        }
        System.out.println("\nSoma = " +soma);

    }
}
