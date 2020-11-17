package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero");
        int n = scan.nextInt();

        double soma = 0;
        for(int i =1, j=1; i<=n;  i++, j += 2){


            System.out.print(i + "/" + j + " + ");
            //System.out.println(somai);

            soma += i/j;

        }
        System.out.println("\nSoma = " +soma);
    }
}


