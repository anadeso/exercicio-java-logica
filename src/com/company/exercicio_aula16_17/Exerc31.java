package com.company.exercicio_aula16_17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc31 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double percentual = 1.5;
        double salario = 1000;

        salario += (salario * percentual)/100;

        DecimalFormat format = new DecimalFormat("###,###.##");

        for(int i=1997 ; i<=2020; i++ ){

            percentual *=2;

            salario += (salario * percentual)/100;
            System.out.println(i + " = "+  format.format(salario) + " - " +percentual);

        }

    }
}
