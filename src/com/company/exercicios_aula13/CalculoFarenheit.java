package com.company.exercicios_aula13;

import java.util.Scanner;

public class CalculoFarenheit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informee temperatura em graus Celsius: ");
        int grausCelisus = scan.nextInt();

        double F = (grausCelisus * 1.8)+ 32;
        System.out.println("Graus em Farenheit:  " +F);

    }
}
