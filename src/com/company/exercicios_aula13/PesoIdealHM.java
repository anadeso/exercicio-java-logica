package com.company.exercicios_aula13;

import java.util.Scanner;

public class PesoIdealHM {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe sua altura, sexo (F/M) e peso ");
        double altura = scan.nextDouble();
        String sexo = scan.next();
        double peso = scan.nextDouble();


        Calculo calc = new Calculo();

        if (sexo.equals("F")){
            double pesoIdeal = calc.calculoFeminino(altura);

            if(peso > pesoIdeal){
                System.out.println("Você está acima do peso");
            } else {
                System.out.println("Você está abaixo do peso");
            }
        } else {

            double pesoIdeal = calc.calculoHomem(altura);
            if(peso > pesoIdeal){
                System.out.println("Você está acima do peso");
            } else {
                System.out.println("Você está abaixo do peso");
            }

        }

    }

    public static class Calculo{

        public double calculoHomem(double altura){
             double pesoM = (72.7 * altura) - 58;
             return pesoM;
        }

        public double calculoFeminino(double altura){
            double pesoF = (62.1 * altura) - 44.7;
            return pesoF;
        }


    }
}
