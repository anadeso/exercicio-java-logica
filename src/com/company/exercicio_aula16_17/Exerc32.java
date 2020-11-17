package com.company.exercicio_aula16_17;

import java.util.Scanner;

public class Exerc32 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtd ;
        int codigoItem;
        double valor =0;
        double soma = 0;
        double valorPorItem = 0;
        String output = "";
        boolean valido = false;

        do {
            System.out.println("Entre com o codigo do produto e quantidade. Digite 0 0 para sair");
            codigoItem = scan.nextInt();
            qtd = scan.nextInt();

            if(codigoItem ==0 || qtd==0) {
                valido = true;
            }else {

                if(codigoItem == 100){
                    output += "Cachorro quente     " + codigoItem +  "      " + "1,20    " + qtd + "           ";
                    output += (qtd * 1.20) + "\n";
                    valor += (qtd * 1.20);

                }
                if(codigoItem == 101){
                    output += "Bauru Simples       " + codigoItem +  "      " + "1,30    " + qtd + "           ";
                    output += (qtd * 1.30) + "\n";
                    valor += (qtd * 1.30);
                }
                if(codigoItem == 102){
                    output += "Bauru com ovo       " + codigoItem +  "      " + "1,50    " + qtd + "           ";
                    output += (qtd * 1.50) + "\n";
                    valor += (qtd * 1.50);
                }
                if(codigoItem == 103){
                    output += "Hambúrguer          " + codigoItem +  "      " + "1,20    " + qtd + "           ";
                    output += (qtd * 1.20) + "\n";
                    valor += (qtd * 1.20);
                }
                if(codigoItem == 104){
                    output += "Cheeseburguer       " + codigoItem +  "      " + "1,30    " + qtd + "           ";
                    output += (qtd * 1.30) + "\n";
                    valor += (qtd * 1.30);
                }
                if(codigoItem == 105){
                    output += "Refrigerante        " + codigoItem +  "      " + "1,00    " + qtd + "           ";
                    output += (qtd * 1.00) + "\n";
                    valor += (qtd * 1.00);
                }

            }


        } while(!valido);

        System.out.println("Especificação       Código   Preço  Quantidade  Valor a pagar" );
        System.out.println(output);
        System.out.println("Valor total a pagar " +valor);

    }
}
