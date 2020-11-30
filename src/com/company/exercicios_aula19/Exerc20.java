package com.company.exercicios_aula19;

import javax.sound.midi.Soundbank;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a cotacao do dolar atual ");
        double dolar = scan.nextDouble();

        double[] vetorA = new double[20];
        double cotacao;

        for(int i=0; i<vetorA.length; i++){
            vetorA[i] = dolar * (i+1);
        }
        DecimalFormat form = new DecimalFormat("##,###.##");
        System.out.println("Cotacao: ");
       for(double vetor : vetorA){
           System.out.println(form.format(vetor) + " ");
       }
    }
}
