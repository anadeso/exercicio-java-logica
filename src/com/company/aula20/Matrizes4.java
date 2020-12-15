package com.company.aula20;

import java.util.Scanner;

/*
* Escreva um programa para guardar dados de uma pesquisa feita com uma
* amostra de pessoas da avenida mais movimentada da cidade onde vc mora.
*
* A pesquisa consiste em perguntar ao cidadao a quantidade de filhos e o
* nome de cada filho. Guarde essas informacoes em uma matriz de forma que
* cada pessoa entrevista ocupe somente o espaco necessario na memoria para
* guardar os nomes dos filhos.
*
* Imprima a quantidade de pessoas entrevistadas, a quantidade de filhos de
* cada entrevistadas e os respectivos nomes dos filhos
* */
public class Matrizes4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o numero de pessoas que serao entrevistadas");
        int numEntrevistados = scan.nextInt();

        String[][] nomesFilhos = new String[numEntrevistados][];

        for(int i=0; i<nomesFilhos.length; i++){

            System.out.println("Entre com a qtd de filhos");
            int qtdFilhos = scan.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for(int j=0; j<nomesFilhos[i].length; j++){

                System.out.println("Digite o nome do filho " +(j+1));
                nomesFilhos[i][j] = scan.next();

            }

        }

        for(int i=0; i<nomesFilhos.length; i++){
            System.out.println("Pessoa " +i + "tem " +nomesFilhos[i].length + " filhos " );

            for(int j=0; j<nomesFilhos[i].length; j++){
                System.out.println(nomesFilhos[i][j] );
            }
        }

    }
}
