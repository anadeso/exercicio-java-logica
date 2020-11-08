package com.company.exercicio_aula14_aula15;

import java.util.Scanner;

public class Exerc8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, informe o preço de três produtos");

        double preco1 = scan.nextDouble();
        double preco2 = scan.nextDouble();
        double preco3 = scan.nextDouble();

        if(preco1 <= preco2 && preco1 <= preco3){
            System.out.println("Você deve comprar esse produto no valor de R$ " +preco1);
        } else if (preco2 <= preco1 && preco2 <= preco3){
            System.out.println("Você deve comprar esse produto no valor de R$ " +preco2);
        } else if (preco3 <= preco1 && preco3 <= preco2){
            System.out.println("Você deve comprar esse produto no valor de R$ " +preco3);
        }
    }
}
