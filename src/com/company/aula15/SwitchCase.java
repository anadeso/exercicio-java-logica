package com.company.aula15;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.println("Entre com um dia da semana (1-7)");

        int diaSemana = sca.nextInt();

        /*
        if (diaSemana == 1){
            System.out.println("Domingo");
        } else if(diaSemana == 2){
            System.out.println("Segunda");
        } else if (diaSemana == 3){
            System.out.println("Terca");
        } else if (diaSemana == 4){
            System.out.println("Quarta");
        } else if (diaSemana == 5){
            System.out.println("Quinta");
        } else if (diaSemana == 6){
            System.out.println("Sexta");
        } else if (diaSemana == 7){
            System.out.println("Sabado");
        } else {
            System.out.println("Nao e um dia da semana valido");
        }*/

        switch(diaSemana){
            //case 1:
                //System.out.println("Domingo");
                //break;
            case 2:
               // System.out.println("Segunda");
               // break;
            case 3:
               // System.out.println("Terca");
               // break;
            case 4:
               // System.out.println("Quarta");
               // break;
            case 5:
               // System.out.println("Quinta");
              //  break;
            case 6:
                //System.out.println("Sexta");
                System.out.println("Dia útil!!");
                break;
            case 1:
            case 7:
                //System.out.println("Sabado");
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Nao e um dia da semana valido");
        }

    }
}
