package com.company.exercicios_aula13;

import java.util.Scanner;

public class SalarioImpostos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe valor hora e numero de horas trabalhadas no mes:");
        double valorHora = scan.nextDouble();
        int numHorasTrabalhadaM = scan.nextInt();

        double salarioBruto = valorHora * numHorasTrabalhadaM;
        System.out.println("Salario Bruto: " +salarioBruto);

        double valorIR = (salarioBruto * 11)/100;
        System.out.println("Imposto de renda: " +valorIR);

        double valorINSS =   (salarioBruto * 8)/100;
        System.out.println("INSS: " +valorINSS);

        double valorSindicato =  (salarioBruto * 5)/100;
        System.out.println("Sindicato: " +valorSindicato);


        double valorLiquido = salarioBruto - valorIR - valorINSS - valorSindicato;
        System.out.println("Salario liquido: " +valorLiquido);

    }
}
