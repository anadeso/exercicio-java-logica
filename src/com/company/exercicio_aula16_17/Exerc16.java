package com.company.exercicio_aula16_17;

public class Exerc16 {

    public static void main(String[] args) {

        int primeiro;
        int segundo;
        int calculo = 0;
        int auxiliar;

        primeiro = 0;
        segundo = 1;

        System.out.print(primeiro +" ");
        System.out.print(segundo +" ");

        while(calculo <= 500){
            calculo = primeiro + segundo;
            primeiro = segundo;
            segundo = calculo;
            System.out.print(calculo +" ");
        }
    }
}
