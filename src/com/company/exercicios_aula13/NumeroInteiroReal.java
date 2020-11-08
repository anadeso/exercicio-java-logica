package com.company.exercicios_aula13;

import java.util.Scanner;

public class NumeroInteiroReal {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        System.out.println("Informe 2 numero inteiros e um numero  real ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        double numero3 = scan.nextDouble();

        int dobro = (numero1 * 2);
        int metade = (numero2 / 2);
        System.out.println("O dobro do primeiro é " +dobro + " e a metado do segundo é " +metade);

        double segundo = (numero1 * 3) + numero3;
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + segundo);

        double terceiro = Math.pow(numero3, 3);
        System.out.println("O terceiro elevado ao cubo: " + terceiro);

    }
}
