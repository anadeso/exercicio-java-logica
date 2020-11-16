package com.company.exercicio_aula16_17;

import java.awt.*;
import java.util.Scanner;

public class Exerc25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean sair = false;
        String continuarCompra;
        int qtdProdutos;
        double preco;
        String output;
        double soma = 0;
        double pagamento;
        double troco;

        do{
            System.out.println("Deseja informar uma nova compra? S/N");
            continuarCompra = scan.next();

            if(continuarCompra.equalsIgnoreCase("s")){

                output = "Lojas Tabajara \n";

                System.out.println("Digite a quantidade de produtos da compra");
                qtdProdutos = scan.nextInt();

                for(int i=1; i<=qtdProdutos; i++){
                    System.out.println("Informe preço do produto " +i);
                    preco = scan.nextDouble();

                    output += "Produto " +i + " : R$ " +preco + "\n";

                    soma += preco;
                }

                output += "Total: R$ " +soma + "\n";
                System.out.println("Entre com o valor do pagamento");
                pagamento = scan.nextDouble();

                output += "Dinheiro: R$ " +pagamento + "\n";
                troco = pagamento - soma;
                output += "Troco: R$ " +troco;
                System.out.println(output);

            }else{
                sair = true;
            }

        }while(!sair);
    }
}
