package com.company.exercicios_aula13;

import java.util.Scanner;

public class SomaDois {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe dois numeros inteiros: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int soma = num1 + num2;
        System.out.println("A soma é " +soma);

    }
}
