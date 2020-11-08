package com.company.exercicio_aula14_aula15;

import java.util.Scanner;

public class Exerc7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 3 números");

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        if (num1 >= num2 && num1 >= num3)  {
            System.out.println(+num1 + " É o maior número");
        } else if (num2 >= num1 && num2 >= num3){
            System.out.println(+num2 + " É o maior número");
        } else {
            System.out.println(+num3 + " É o maior número");
        }

        if (num1 <= num2 && num1 <= num3)  {
            System.out.println(+num1 + " É o menor número");
        } else if (num2 <= num1 && num2 <= num3){
            System.out.println(+num2 + " É o menor número");
        } else {
            System.out.println(+num3 + " É o menor número");
        }

    }
}
