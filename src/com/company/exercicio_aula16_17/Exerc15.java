package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc15 {

    public static void main(String[] args) {

        int primeiro = 1;
        int segundo = 1;
        int calculo;
        int varAuxiliar;
        System.out.print(1 + ", ");
        System.out.print(1 + ", ");

        for(int n=3; n<=10; n++){

            calculo = primeiro  +  segundo;
            primeiro = segundo;
            segundo = calculo;
            System.out.print(calculo + " ");

        }

    }
}
