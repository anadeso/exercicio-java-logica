package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        boolean infoValida = false;

        do {

            System.out.println("Informe o nome");
            nome = scan.nextLine();

            if(nome.length() >= 3){
                infoValida = true;
                System.out.println("Nome com mais de 3 caracteres - " +nome);
            }else {
                System.out.println("Nome com menos de 3 caracteres. Informe novamente - " +nome);
            }

        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Informe a idade");
            idade = scan.nextInt();

            if(idade >= 0 && idade<=150){
                infoValida = true;
                System.out.println("Idade esta entre 0 e 150 - " +idade);
            }else{
                System.out.println("Idade nao esta entre 0 e 150. . Informe novamente" +idade);
            }

        } while (!infoValida);

        infoValida = false;
        do{

            System.out.println("Informe o salário");
            salario = scan.nextDouble();

            if(salario > 0){
                infoValida = true;
                System.out.println("Salario maior que zero - " +salario);
            }else {
                System.out.println("Salario menor que zero. . Informe novamente " +salario);
            }

         } while(!infoValida);

        infoValida = false;
        do{
            System.out.println("Informe o sexo - f/m");
            sexo = scan.next();

            if(sexo.equalsIgnoreCase("f") ||sexo.equalsIgnoreCase("m")){
                infoValida = true;
                System.out.println("Sexo não é f ou m " +sexo);
            }else {
                System.out.println("Sexo nao é f ou m. . Informe novamente" +sexo);
            }

        } while(!infoValida);

        infoValida = false;
        do{
            System.out.println("Informe o estado civil - s/c/v/d");
            estadoCivil = scan.next();

            if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") ||
               estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d") ){
                infoValida = true;
                System.out.println("O estado civil é s ou c ou v ou d ");
            }else {

                System.out.println("O estado civil nao é s ou c ou v ou d. . Informe novamente ");
            }
        }while(!infoValida);

    }
}
