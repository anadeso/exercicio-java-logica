package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc35 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero");
        int num = scan.nextInt();
        double soma =0;

        for(int i=1, j=1; i<=num; i++, j +=2){

            System.out.print(i + "/" + j + " + ");

            soma += i/j;
        }

        System.out.print("\n Soma = " +soma);
    }
}
