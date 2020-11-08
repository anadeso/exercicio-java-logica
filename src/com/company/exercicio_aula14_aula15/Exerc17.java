package com.company.exercicio_aula14_aula15;

import java.util.Scanner;

public class Exerc17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um ano");

        int ano = scan.nextInt();

        double anoBi = (ano%4);

        if(anoBi == 0){
            System.out.println("Ano Bissexto");
        }else {
            System.out.println("Nao é um ano bissexto");
        }
    }
}
