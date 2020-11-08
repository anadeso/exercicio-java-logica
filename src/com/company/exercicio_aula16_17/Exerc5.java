package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double popA;

        double taxaA ;
        double popB;
        double taxaB;

        boolean validaFlag = false;
        int count = 0;

        do{
            System.out.println("Informe o numero da populacao A");
            popA =  scan.nextDouble();

            if(popA > 0){
                validaFlag = true;
            }else {
                validaFlag = false;
                System.out.println("Por favor, informe numero da populacao A");
            }

        } while(!validaFlag);

        validaFlag = false;
        do{
            System.out.println("Informe a taxa de crescimento da populacao A");
            taxaA = scan.nextDouble();

            if(taxaA > 0){
                validaFlag = true;
            }else {
                validaFlag = false;
                System.out.println("Por favor, informe a taxa da populacao correta");
            }

        }while(!validaFlag);

        validaFlag = false;
        do{
            System.out.println("Informe o numero da populacao B");
            popB = scan.nextDouble();

            if(popB > 0){
                validaFlag = true;
            }else{
                validaFlag = false;
                System.out.println("Por favor, informe o numero da populacao correta");
            }
        }while(!validaFlag);

        validaFlag = false;
        do{
            System.out.println("Informe a taxa de crescimento da populacao B");
            taxaB = scan.nextDouble();

            if(taxaB > 0){
                validaFlag = true;
            }else{
                validaFlag = false;
                System.out.println("Por favor, informe a taxa correta");
            }

        }while(!validaFlag);

        while(popA < popB){
            popA += (popA * taxaA) / 100;
            popB += (popB * taxaB) / 100;
            count++;
        }

        System.out.println("A populacao A ira utrapassar a populacao B em " +count + " anos");
        System.out.println("Populacao A " +popA);
        System.out.println("Populacao B " +popB);

    }
}
