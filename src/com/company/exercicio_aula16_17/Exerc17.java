package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero");
        int num = scan.nextInt();
        int fatorial = 1;

        System.out.print(num + "!=");

        for(int x = num; x>0; x--){
            fatorial *= x;
            System.out.print(" " +x);
        }

        System.out.print("=" +fatorial);


    }
}
