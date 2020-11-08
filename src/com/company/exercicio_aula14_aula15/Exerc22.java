package com.company.exercicio_aula14_aula15;

import java.util.Scanner;

public class Exerc22 {

    public static void main(String[] args) {
//https://www.youtube.com/watch?v=KwprmJ-7d4Y&ab_channel=DiogoPereiraDev
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade (kg) de morango ");
        System.out.println("Informe a quantidade (kg) de maca");

        double qtdMorango = scan.nextDouble();
        double qtdMaca = scan.nextDouble();

        double valorMorango5 = 2.50;
        double valorMaca5 = 1.80;
        double valorMorangoAcima5 = 2.20;
        double valorMacaAcima5 = 1.50;
        double totalCompra = 0;
        double totalDaCompra = 0;
        double totalMorango =0;
        double totalMaca = 0;
        //totalDaCompra = qtdMorango + qtdMaca;

        if(qtdMorango <= 5 ){
            totalMorango = qtdMorango * valorMorango5;
        }else{
            totalMorango = qtdMorango * valorMorangoAcima5;
        }

        if (qtdMaca <= 5){
            totalMaca = qtdMaca * valorMaca5;
        }else{
            totalMaca = qtdMaca * valorMacaAcima5;
        }

        totalDaCompra = totalMorango + totalMaca;

        if((qtdMorango + qtdMaca > 8) || totalDaCompra > 25){

            totalDaCompra -= (totalDaCompra * 0.10) ;
            System.out.println("Total compra: " +totalDaCompra);
        }else {
            System.out.println("Total compra: " +totalDaCompra);
        }

    }
}

