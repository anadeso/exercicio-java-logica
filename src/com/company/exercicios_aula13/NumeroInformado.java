package com.company.exercicios_aula13;

import java.util.Scanner;

public class NumeroInformado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        int numero = scan.nextInt();

        System.out.println("O numero informado foi " +numero);

    }
}
