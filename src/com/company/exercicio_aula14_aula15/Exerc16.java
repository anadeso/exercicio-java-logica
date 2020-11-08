package com.company.exercicio_aula14_aula15;

import java.util.Scanner;

public class Exerc16 {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        System.out.println("Informe ovalor a");
        double a = scan.nextDouble();

        if(a == 0){
            System.out.println("A equacao nao é de segundo grau");
        }
        System.out.println("Informe o valor b");
        double b = scan.nextDouble();

        System.out.println("Iforme o valor c");
        double c = scan.nextDouble();

        double delta = Math.pow(b,2) - (4 * a * c);

        if(delta < 0){
            System.out.println("A equacao nao possui raizes reais");
        } else if (delta == 0){
            System.out.println("A equacao possui apenas uma raiz real");
        } else if (delta > 0){
            System.out.println("A equacao possui duas raiz rais");
        }

    }
}
