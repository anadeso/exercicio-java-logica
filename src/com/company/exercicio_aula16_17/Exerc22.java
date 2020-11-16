package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de CDs");
        int qtdCds = scan.nextInt();

        double valorTotal = 0;
        double mediaGasto;
        double precoCd;

        for(int i=1; qtdCds>=i; i++){

            System.out.println("Entre com o valor CD " +i);
             precoCd = scan.nextDouble();

            valorTotal += precoCd;

        }
        mediaGasto = valorTotal/qtdCds;

        System.out.println("O valor total: " +valorTotal);
        System.out.println("A media " +mediaGasto);
    }
}
