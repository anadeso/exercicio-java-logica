package com.company.exercicios_aula13;

import java.util.Scanner;

public class Metro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o metro quadrado: ");

        double metro = scan.nextDouble();

        double centimentro = metro * 100;

        System.out.println("Metro convertdo para centimetro é: " + centimentro);

    }
}
