package com.company.exercicio_aula14_aula15;

import java.util.Scanner;

public class Exerc21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tipo de combustível - A-álcool / G-gasolina: ");
        System.out.println("Informe a quantidade de litros vendidos");

        String tipoCombustivel = scan.next();

        double qtdEmLitros = scan.nextDouble();
        double desconto;
        double valorAPagar =0;
        double precoGas = 2.50;
        double precoAlc = 1.90;
        double promocao = 0;
        double total = 0;

        if(tipoCombustivel.equalsIgnoreCase("G")){

            if(qtdEmLitros <= 20){
                promocao = 4;

            }else if(qtdEmLitros > 20){
                promocao = 6;
            }

            total = qtdEmLitros * precoGas;

        } else if (tipoCombustivel.equalsIgnoreCase("A")){

            if (qtdEmLitros <= 20){
                promocao = 3;
            } else if(qtdEmLitros > 20){
               promocao = 5;
            }

            total = qtdEmLitros *precoAlc;
        }
        desconto = (total * promocao)  / 100;
        valorAPagar = total - desconto;

        System.out.println("O valor a ser pago R$ " +valorAPagar);
    }
}
