package com.company.exercicio_aula14_aula15;

import java.util.Scanner;

public class VogalConsoante {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra ");
        String letra = scan.next();

        if (letra.length() > 1){
            System.out.println("Nao e uma letra valida");

        } else {

            switch (letra){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("Você digitou uma vogal");
                    break;
                default:
                    System.out.println("Você digitou uma consoante");
            }

    }
}
}
