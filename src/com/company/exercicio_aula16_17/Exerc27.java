package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de temperatura");
        int qtdTemperatura = scan.nextInt();

        double temperatura;
        double soma = 0;

        double maior = Double.MAX_VALUE;
        double menor = Double.MIN_VALUE;

        for(int i = 1; i<=qtdTemperatura; i++){

            System.out.println("Entre com a temperatura");
            temperatura = scan.nextDouble();

            soma += temperatura;

            if(temperatura > maior){
                maior = temperatura;
            }

            if(temperatura < menor){
                menor = temperatura;
            }
        }

        System.out.println("A soma da temperatura " +soma);
        System.out.println("A media é " +soma/qtdTemperatura);
        System.out.println("A maior temperatura " +maior);


    }
}
