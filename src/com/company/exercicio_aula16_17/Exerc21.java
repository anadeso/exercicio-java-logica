package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de turma");
        int qtdTurma = scan.nextInt();

        int somaAlunos = 0;
        int mediaAlunoPorTurma;
        int qtdAluno = 0;

        boolean invalido = false;
        for(int i=0; i < qtdTurma; i++){

            invalido = true;

            do{
                System.out.println("Informe a quantidade de alunos");
                qtdAluno = scan.nextInt();

                if(qtdAluno <= 40){
                    invalido = false;
                }else{
                    System.out.println("Numero invalido. Digite novamente");
                }

            }while (invalido);

            somaAlunos += qtdAluno;
        }

        mediaAlunoPorTurma = somaAlunos/qtdTurma;
        System.out.println("A media de aluno por turma é " +mediaAlunoPorTurma);
    }
}
