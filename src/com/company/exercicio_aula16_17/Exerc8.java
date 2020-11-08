package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numero;
        double media;
        double soma =  0;

        for(int x = 0; x < 5; x++){

            System.out.println("Informe o numero");
            numero = scan.nextDouble();

            soma += numero;

        }
        System.out.println("Soma é: " +soma);
        System.out.println("Media é: " +soma/5) ;


    }
}
