package com.company.exercicio_aula16_17;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class Exerc10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero inteiro");
        int num1 = scan.nextInt();

        System.out.println("Informe o segundo numero inteiro");
        int num2 = scan.nextInt();

        for(int x=num1; x<=num2; x++){
            System.out.println(x);
        }

    }
}
