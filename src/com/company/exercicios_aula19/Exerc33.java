package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor do vetor A");
            vetorA[i] = scan.nextInt();
        }

        boolean priomo = true;
        String msg;
        for (int i=0; i<vetorA.length; i++) {

            for (int j = 2; j < vetorA[i]; j++) {

                if (vetorA[i] % j == 0) {
                    priomo = false;
                    break;
                }
            }

            msg = "";

            if (priomo) {
                msg = "Primo";
            } else {
                msg = "Nao primo";
            }

            System.out.println(vetorA[i] + " " + msg);

        }
    }
}
