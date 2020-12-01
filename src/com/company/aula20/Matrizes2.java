package com.company.aula20;

public class Matrizes2 {

    public static void main(String[] args) {

        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 8;
        notasAlunos[0][2] = 7;
        notasAlunos[0][3] = 10;

        notasAlunos[1][0] = 8;
        notasAlunos[1][1] = 9;
        notasAlunos[1][2] = 10;
        notasAlunos[1][3] = 7;

        notasAlunos[2][0] = 10;
        notasAlunos[2][1] = 8;
        notasAlunos[2][2] = 7;
        notasAlunos[2][3] = 9;

        /*
        for(int i=0; i<notasAlunos.length; i++){

            System.out.println("Notas do aluno " +i);
            for(int j=0; j<notasAlunos[i].length; j++){
                System.out.println(notasAlunos[i][j] + " ");
            }
            System.out.println();

        }

        notasAlunos[1][3] = 10;
        System.out.println();
        for(int i=0; i<notasAlunos.length; i++){

            System.out.println("Aluno " +i);
            for(int j=0; j<notasAlunos[i].length; j++){
                System.out.println(notasAlunos[i][j]);
            }

        }*/

        double soma;
        System.out.println();

        for(int i=0; i<notasAlunos.length; i++){

            soma = 0;
            for(int j=0; j<notasAlunos[i].length; j++){
                soma += notasAlunos[i][j];
            }

            System.out.println("Media é " +(soma/4));
        }

        double[] notasAluno1 = {7,8,9,10};
        double[][] notasAluno2 = {{9,5,7,9}, {8,9,6,7}};

    }
}
