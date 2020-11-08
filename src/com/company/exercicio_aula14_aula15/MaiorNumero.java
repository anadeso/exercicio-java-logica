package com.company.exercicio_aula14_aula15;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe dois numero ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        if (num1 > num2){
            System.out.println(num1 + " - sou o numero maior ");
        } else {
            System.out.println( num2 + " - sou o numero maior ");

        }

    }
}
