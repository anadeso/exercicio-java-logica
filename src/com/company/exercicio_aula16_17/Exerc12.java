package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor da tabuada");
        int numero = scan.nextInt();
        int tabuada;
        System.out.println("Tabuada de " +numero);

        for(int x = 1; x <=10; x++){
            System.out.println(numero + " x " + x);

        }
    }
}
