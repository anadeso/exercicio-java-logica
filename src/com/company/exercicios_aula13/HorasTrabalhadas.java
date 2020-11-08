package com.company.exercicios_aula13;

import java.util.Scanner;

public class HorasTrabalhadas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quanto ganha por hora e o numero de horas trabalhadas no mes: ");

        double ganhaPorHora = scan.nextDouble();
        int numerohora = scan.nextInt();

        double totalSalarioMes = ganhaPorHora * numerohora;

        System.out.println("Salario referido ao mes: " + totalSalarioMes);

    }
}
