package com.company.exercicios_aula13;

import java.util.Scanner;

public class ContrlePescador {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o peso do peixe: ");
        double pesoPeixe = scan.nextDouble();

        if(pesoPeixe > 50){
            double valorExcesso = pesoPeixe - 50;
            double valorMulta = valorExcesso * 4;
            System.out.println("O valor de excesso é " +valorExcesso);
            System.out.println("Valor da multa é " +valorMulta);
        } else {
            int valorExcesso = 0;
            int valorMulta = 0;
            System.out.println("O valor de excesso é " +valorExcesso);
            System.out.println("Valor da multa é " +valorMulta);

        }

    }
}
