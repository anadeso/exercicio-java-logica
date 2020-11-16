package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero ");
        int num = scan.nextInt();

        int fatorial = 1;
        int auxiliar = num;
        int conta = 1;

        System.out.println("Fatorial de: " +num);
        System.out.print(num + "! = ");

        for(int i =1; i<=num; i++){


            System.out.print(
                    " " +  auxiliar
            );
            conta *= auxiliar;
            auxiliar -=fatorial;

        }

        System.out.println(" = " +conta);

    }
}


