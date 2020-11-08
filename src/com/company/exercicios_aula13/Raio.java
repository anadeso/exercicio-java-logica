package com.company.exercicios_aula13;

import java.util.Scanner;

public class Raio {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o raio: ");

        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area é: " +area);

    }
}
