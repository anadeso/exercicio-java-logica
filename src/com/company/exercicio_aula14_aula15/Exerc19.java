package com.company.exercicio_aula14_aula15;

import java.util.Scanner;

public class Exerc19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe numero 1 e numero 2");
        System.out.println("Qual operacao a se fazer: + - * /");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        String operacao = scan.next();
        int valorOperacao = 0;
        boolean valida = true;

        switch (operacao){
            case "+":
                System.out.println("Operacao soma");
                valorOperacao = (num1 + num2);
                break;
            case "=":
                System.out.println("Operacao subtracao");
                valorOperacao = (num1 - num2);
                break;
            case "*":
                System.out.println("Operacao multiplicacao");
                valorOperacao = (num1 * num2);
                break;
            case "/":
                System.out.println("Operacao divicao");
                valorOperacao = (num1 / num2);
                break;
            default:
                System.out.println("Operacao invalida");
                valida = false;
        }


        if (valida){

            if(valorOperacao >=0){
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
            }

            if(valorOperacao % 2 == 0){
                System.out.println("Par");
            }else{
                System.out.println("Impar");
            }
        }

    }
}
