package com.company.exercicio_aula14_aula15;

import javax.xml.parsers.SAXParser;
import java.util.Scanner;

public class Exerc12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe valor hora e qtd de horas trabalhadadas no mes");
        double valorHora = scan.nextDouble();
        double qtdHorasMes = scan.nextDouble();

        double salarioBruto = (valorHora *qtdHorasMes);

        double porcentagemIr = 0;

        if (salarioBruto <= 900.00){
            porcentagemIr = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500.00){
            porcentagemIr = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500){
            porcentagemIr = 10;
        } else if (salarioBruto > 2500){
            porcentagemIr = 20;
        }

        System.out.println("Salário Bruto: " +salarioBruto);

        double valorIr = (salarioBruto * porcentagemIr)/100;
        System.out.println("IR: isento " +valorIr );

        //double valorSindicato = (salarioBruto * 3) / 100;
        //System.out.println("Sindicato: " +valorSindicato);

        double valorInss = (salarioBruto * 10) / 100;
        System.out.println("INSS: " +valorInss);

        double valorFgts = (salarioBruto * 11) / 100;
        System.out.println("FGTS: " +valorFgts);

        double totalDesconto = (valorIr +valorInss);
        System.out.println("Total de desconto: " +totalDesconto);

        double salarioLiquido = (salarioBruto - totalDesconto);
        System.out.println("Salário Liquido " +salarioLiquido);

    }
}
