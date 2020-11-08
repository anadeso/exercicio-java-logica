package com.company.exercicio_aula14_aula15;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o turno que estuda(LETRA MAIUSCULA) - M-matutino ou V-vespertino ou N-noturno");

        String turno = scan.next();

        if(turno.length() > 1){
            System.out.println("Letra invalida");
        } else {
            switch(turno){
                case "M":
                    System.out.println("Bom dia!");
                    break;
                case "V":
                    System.out.println("Boa tarde!");
                    break;
                case "N":
                    System.out.println("Boa noite!");
                    break;
                case "m":
                    System.out.println("Bom dia!");
                    break;
                case "v":
                    System.out.println("Boa tarde!");
                    break;
                case "n":
                    System.out.println("Boa noite!");
                    break;
                default:
                    System.out.println("Turno nao encontrado");
            }
        }


    }
}
