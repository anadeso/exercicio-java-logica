package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        int[] aluno = new int[10];
        double[] result = new double[10];
        for(int i=0; i<aluno.length; i++){;
            System.out.println("Entre com a nota1 e nota2: " +(i+1));
            nota1[i] = scan.nextDouble();
            nota2[i] = scan.nextDouble();
        }

       // double media;
        for(int i=0; i<aluno.length; i++){
            result[i] = (nota1[i]  + nota2[i])/ 2;
        }

        for(int i=0; i<aluno.length; i++){
            if(result[i] >= 7){
                System.out.println("Media é: " +result[i] + " referente ao aluno " +(i +1) + " Aprovado");
            } else{
                System.out.println("Media é: " +result[i] + " referente ao aluno " +(i +1) + " Reprovado");
            }
        }

    }
}
