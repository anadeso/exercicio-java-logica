package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a quantidade de idades");
        int idades = scan.nextInt();

        int mediaIdade;
        int somaIdades = 0;

        for(int i=0; i<idades; i++){

            System.out.println("Informe a idade");
            int idade = scan.nextInt();

            somaIdades += idade;

        }

        mediaIdade = somaIdades/idades;

        System.out.println("A media é " +mediaIdade);

        if(mediaIdade >= 0 && mediaIdade <=25){
            System.out.println("Turma jovem");
        } else if(mediaIdade >=26 && mediaIdade <=60){
            System.out.println("Turma adulta");
        } else if(mediaIdade > 60){
            System.out.println("Turma idosa");
        }
    }
}
