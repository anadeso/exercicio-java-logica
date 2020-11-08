package com.company.exercicio_aula14_aula15;

import java.util.Scanner;

public class NumPositivoNegativo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um valor: ");

        double num = scan.nextDouble();

        if(num >= 0){
            System.out.println("O número é positivo");
        } else {

            System.out.println("O número é negativo");
        }
    }
}
