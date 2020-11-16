package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc30 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a tabuada");
        int tabuada =scan.nextInt();

        boolean invalido = false;
        int comeca = 0;
        int termina = 0;

        do{

            System.out.println("Tabuada inciara em: ");
            comeca = scan.nextInt();
            System.out.println("Tabuada finilizara em ");
            termina = scan.nextInt();

            if(termina < comeca){
                invalido = true;
            }
        }while(invalido);

        System.out.println("Montar a tabuada de: " +tabuada);
        System.out.println("Começar por: " +comeca);
        System.out.println("Terminar em: " +termina);
        System.out.println();

        System.out.println("Vou montar a tabuada de " + tabuada + " começando em " + comeca + " e terminando em " +termina + ":");
        for(int i=comeca; i<=termina; i++){

            System.out.println(tabuada + "x " +i + " = " +tabuada*i);

        }

    }
}
