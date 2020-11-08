package com.company.exercicio_aula14_aula15;

import java.util.Scanner;

public class Exerc11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe seu salario");
        double salario = scan.nextDouble();

        double porcentagem = 0.0;

        if (salario <= 280.00){
            porcentagem = 20;
        } else if(salario >= 280.00 && salario < 700.00){
           porcentagem = 15;
        } else if(salario >= 700.00 && salario <  1500.00){
            porcentagem = 10;
        } else if(salario >= 1500.00){
           porcentagem = 5;
        }

        System.out.println("O salario antes do reajuste: " +salario);
        System.out.println("Percentual antes do aumento: " +porcentagem);
        double valorAumento = (salario  * porcentagem) / 100;
        System.out.println("O valor do aumento: " +valorAumento);
        double novoSalario = salario + valorAumento;
        System.out.println("O novo salario apos aument: " +novoSalario);


    }
}
