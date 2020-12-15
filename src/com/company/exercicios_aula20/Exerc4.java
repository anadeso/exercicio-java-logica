package com.company.exercicios_aula20;

import java.util.Scanner;

public class Exerc4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] compromissoPessoal = new String [31][24];

        int opcao;
        int dia = 0;
        int hora= 0;
        boolean sair = false;

        while(!sair){

            boolean diaValido = false;
            boolean horaValida = false;

            System.out.println("Entre com a opcao 1 para adicionar compromisso, 2 para consultar ou 0 para sair");
            opcao = scan.nextInt();

            if(opcao == 1){

                while(!diaValido){

                    System.out.println("Entre com o dia do mês do compromisso ");
                    dia = scan.nextInt();

                    if(dia >= 1 && dia <= 31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente ");
                    }
                }

                while(!horaValida){

                    System.out.println("Entre com a hora do compromisso ");
                    hora = scan.nextInt();

                    if(hora >=0 && hora <= 24){
                        horaValida = true;
                    } else{
                        System.out.println("Hora invalida, por favor, digite novamente");
                    }
                }

                dia--;
                System.out.println("Entre com o compromisso");
                compromissoPessoal[dia][hora] = scan.next();

            } else if (opcao == 2){

                while(!diaValido){

                    System.out.println("Entre com o dia do mês do compromisso");
                    dia = scan.nextInt();

                    if(dia >= 1 && dia <= 31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente");
                    }
                }

                while(!horaValida){

                    System.out.println("Entre com a hora do compromisso");
                    hora = scan.nextInt();

                    if(hora >=0 && hora <= 24){
                        horaValida = true;
                    } else {
                        System.out.println("Hora invalida, digite novamente");
                    }
                }

                dia--;
                System.out.println("O compromisso é " +compromissoPessoal[dia][hora]);

            } else if (opcao == 0){
                sair = true;
            } else {
                System.out.println("Opcao invalida, digite novamente");
            }

        }
    }
}
