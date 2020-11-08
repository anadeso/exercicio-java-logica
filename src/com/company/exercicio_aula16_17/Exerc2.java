package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean nomeIgual = false;
        String nome;
        String senha;

        do{
            System.out.println("Informe seu nome");
            nome = scan.nextLine();
            System.out.println("Informe a senha");
            senha = scan.nextLine();

            if(senha.equalsIgnoreCase(nome)){
                System.out.println("Senha é igual a usuário, digite novamente.");
            } else {
                nomeIgual = true;
                System.out.println("Senha e usuário válidos");
            }
        }while(!nomeIgual);
    }
}
