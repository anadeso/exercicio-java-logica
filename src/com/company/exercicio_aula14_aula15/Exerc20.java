package com.company.exercicio_aula14_aula15;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Exerc20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int contador = 0;

        System.out.println("Telefonou para a vítima? (S/N) ");
        String telefonou = scan.next();

        System.out.println("Estve no local do crime? (S/N) ");
        String esteve = scan.next();

        System.out.println("Mora perto da vítima? (S/N)");
        String mora = scan.next();

        System.out.println("Devia para a vitima? (S/N)");
        String devia = scan.next();

        System.out.println("Ja trabalhou para a vitima? (S/N)");
        String trabalhou = scan.next();

        if(telefonou.equalsIgnoreCase("S")){
            contador++;
        }
        if(esteve.equalsIgnoreCase("S")){
            contador++;
        }

        if (mora.equalsIgnoreCase("S")){
            contador++;
        }

        if (devia.equalsIgnoreCase("S")){
            contador++;
        }

        if(trabalhou.equalsIgnoreCase("S")){
            contador++;
        }

        switch(contador){
            case 2:
                System.out.println("A pessoa é Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("A pessoa é Cúmplice");
                break;
            case 5:
                System.out.println("A pessoa é Assassina");
                break;
            default:
                System.out.println("A pessoa é Inocente");
        }
    }
}
