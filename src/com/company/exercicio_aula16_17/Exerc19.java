package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com numero de notas");
        int notas = scan.nextInt();

        double soma =0;
        double nota;
        double media;

        for(int i =0 ; i<notas; i++){

            System.out.println("Entre com a nota");
            nota = scan.nextDouble();

            soma += nota;

        }

        media = soma/notas;

        System.out.println("Numero de notas " +notas);
        System.out.println("Soma " +soma);
        System.out.println("Media " +media);

    }
}
