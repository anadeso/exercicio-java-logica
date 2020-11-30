package com.company.aula18;

import java.util.Scanner;

public class Arrays {

    // Estrutura de dados
    // Lista ordenada de dados

    // Problema - armazenar a temperatura media diaria por 1 ano
    // Array - armazenar uma lista de dados
    public static void main(String[] args) {

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("Temperatura é " +temperaturas[0]);

        System.out.println("Tamanho array - quantas posicoes na memoria " +temperaturas.length);
        System.out.println("");

        for(int i=0; i<temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia " + (i+1) + " é " + temperaturas[i]);
        }

        for(double temp :temperaturas){

            System.out.println(temp);
        }




    }
}
