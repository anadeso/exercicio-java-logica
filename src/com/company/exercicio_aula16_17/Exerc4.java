package com.company.exercicio_aula16_17;

public class Exerc4 {

    public static void main(String[] args) {

        int popA = 80000;
        int popB = 200000;
        int count = 0;

        while (popA < popB){
            popA += popA * 0.03;
            popB += popB * 0.015;
            count++;
        }

        System.out.println("A populacao A ira utrapassar a populacao B em " +count + " anos");
        System.out.println("Populacao A " +popA);
        System.out.println("Populacao B " +popB);
    }
}
