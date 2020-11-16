package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc24 {

    public static void main(String[] args) {

        Scanner scan = new  Scanner(System.in);

        System.out.println("Entre com o preco do pao");
        double valorPao = scan.nextDouble();

        System.out.println("Preço do pão: R$ " +valorPao);
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        for(int i=1; i<=50; i++){

            System.out.println(i + " - R$ " + i*valorPao );
        }

    }
}
