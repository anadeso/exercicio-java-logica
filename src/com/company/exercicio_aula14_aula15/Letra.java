package com.company.exercicio_aula14_aula15;

import java.util.Scanner;

public class Letra {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe seu sexo - Feminino(F)/Masculino(M) ");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("f")){
            System.out.println("F - Feminino");
        } else if (sexo.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
        } else{
            System.out.println("Sexo Inválido");
        }

    }
}
