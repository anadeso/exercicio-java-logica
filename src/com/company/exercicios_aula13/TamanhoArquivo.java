package com.company.exercicios_aula13;

import java.util.Scanner;

public class TamanhoArquivo {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        System.out.println("Informe o tamanho do arquivo para download e velocidade de um link de internet: ");
        int tamanho = scan.nextInt();
        int velocidade = scan.nextInt();

        double tempo = (tamanho / velocidade) * 60;

        System.out.println("Tempo aproximadamento de download: " +tempo);

    }
}
