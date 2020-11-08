package com.company.exercicios_aula13;

import java.util.Scanner;

public class CalculoCelsius {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informee temperatura em graus Farenheit: ");
        int grausFarenheit = scan.nextInt();

        int C = (5 *(grausFarenheit-32) / 9);
        System.out.println("Temperatra em graus Celsius: " +C);
    }
}
