package com.company.exercicio_aula14_aula15;

import java.util.Scanner;

public class NotasParciais {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe as duas notas");

        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();

        double mediaDoAluno = (nota1 + nota2) / 2;

        if(nota1 > 10 || nota2 > 10){
            System.out.println("Nota Invalida");
        }else if(mediaDoAluno >= 7 && mediaDoAluno < 10){
                   System.out.println("Aprovado");
               } else if (mediaDoAluno < 7){
                   System.out.println("Reprovado");
               }  else if(mediaDoAluno == 10){
                   System.out.println("Aprovado com Distinção");
               }

    }
}
