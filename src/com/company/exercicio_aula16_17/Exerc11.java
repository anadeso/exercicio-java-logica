package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro numero inteiro");
        int numero1 = scan.nextInt();

        System.out.println("Informe o segundo numero inteiro");
        int numero2 = scan.nextInt();

        int soma = 0;

        for(int x = numero1; x<=numero2; x++){

            soma += x;

        }

        System.out.println("A soma é " +soma);

    }
}
