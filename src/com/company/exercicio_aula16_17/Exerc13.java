package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o numero base");
        int base = scan.nextInt();
        System.out.println("Informe o expoente");
        int pot = scan.nextInt();

        int numero = base;

        for(int x=1; x<pot; x++){
            numero *= pot;
        }

        System.out.println(numero);

    }
}



