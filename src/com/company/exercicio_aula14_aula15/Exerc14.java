package com.company.exercicio_aula14_aula15;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Exerc14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, informe duas notas");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();

        System.out.println("As notas sao: " +nota1 + " e " + +nota2);
        double media = (nota1 + nota2) / 2;
        System.out.println("A media " +media);

        String aproveitamento = "";
        if(media >= 9 && media <= 10){
            aproveitamento = "A";
        } else if(media >= 7.5 && media < 9){
            aproveitamento = "B";
        } else if(media >= 6 && media < 7.5){
            aproveitamento = "C";
        } else if(media >= 4 && media < 6){
            aproveitamento = "D";
        } else if(media < 4){
            aproveitamento = "E";
        }

        System.out.println("Aproveitamento: " +aproveitamento);

        if(media >= 6.0 && media <= 10.0){
            System.out.println("APROVADO");
        } else if (media >= 0.0 && media < 6.0){
            System.out.println("REPROVADO");
        }

    }
}
