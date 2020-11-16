package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countPar = 0;
        int countImpar = 0;
        int num;
        for(int x = 1; x <=10; x++){
            System.out.println("Informe o numero");
            num = scan.nextInt();

            if(num%2 == 0){
                countPar++;
            }else {
                countImpar++;
            }

        }

        System.out.println("Quantidade de pares " +countPar);
        System.out.println("Quantidade de impares " +countImpar);
    }
}
