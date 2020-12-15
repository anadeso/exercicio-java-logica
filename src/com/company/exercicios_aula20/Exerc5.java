package com.company.exercicios_aula20;

import java.util.Scanner;

public class Exerc5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [][][] compromissoAnual = new String[12][31][8];

        boolean sair = false;

        int opcao;
        int mes= 0;
        int dia = 0;
        int hora = 0;

        while(!sair){

            System.out.println("Digite 1 para adicionar compromisso, 2 para consulta e 0 para sair");
            opcao = scan.nextInt();

            if(opcao == 1){

                boolean mesValido = false;

                while(!mesValido){

                    System.out.println("Informe o mes do compromisso 1 a 12");
                    mes = scan.nextInt();


                    if(mes >= 1 && mes <= 12){
                        mesValido = true;
                    } else{
                        System.out.println("Mes invalido, digite novamente");
                    }

                }

                boolean diaValido = false;

                while(!diaValido){

                    System.out.println("Informe o dia do compromisso");
                    dia = scan.nextInt();

                    if(dia >= 1 && dia <= 31){
                        diaValido = true;
                    } else{
                        System.out.println("Dia invalido, digite novamente");
                    }

                }

                boolean horaValida = false;

                while(!horaValida){

                    System.out.println("Informe a hora do compromisso");
                    hora = scan.nextInt();

                    if(hora >= 0 && hora <=8){
                        horaValida = true;
                    } else{
                        System.out.println("Hora invalida, digite novamente");
                    }
                }

                mes--;
                dia--;
                System.out.println("Informe o compromisso");
                scan.nextLine();
                compromissoAnual[mes][dia][hora] = scan.nextLine();

            } else if(opcao == 2){

                boolean mesValido = false;

                while(!mesValido){

                    System.out.println("Entre com o mes - Entre 1 a 12");
                    mes = scan.nextInt();

                    if(mes >= 1 && mes <= 12){
                        mesValido = true;
                    } else{
                        System.out.println("Mes invalido, digite novamente");
                    }

                }

                boolean diaValido = false;

                while(!diaValido){

                    System.out.println("Entre com o dia do compromisso");
                    dia = scan.nextInt();

                    if(dia >= 1 && dia <= 31){
                        diaValido = true;
                    } else{
                        System.out.println("Dia invalido, digite novamente");
                    }

                }

                boolean horaValida = false;

                while(!horaValida){

                    System.out.println("Entre com a hora do compromisso");
                    hora = scan.nextInt();

                    if(hora >= 0 && hora <= 8){
                        horaValida = true;
                    } else{
                        System.out.println("Hora invalida, digite novamente");
                    }
                }

                mes--;
                dia--;
                System.out.println("O compromisso é " +compromissoAnual[mes][dia][hora]);

            } else if(opcao == 0){
                sair = true;
            }

        }

    }
}
