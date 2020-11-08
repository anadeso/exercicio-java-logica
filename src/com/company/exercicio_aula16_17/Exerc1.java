package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do{
            System.out.println("Informe uma nota: ");
            double nota = scan.nextDouble();

            if(nota >= 0 && nota <=10){
                notaValida = true;
                System.out.println("A nota informada foi " +nota);
            }else{
                System.out.println("A nota é inválida");
            }
        }while(!notaValida);

    }
}
