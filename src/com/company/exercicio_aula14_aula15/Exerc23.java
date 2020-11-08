package com.company.exercicio_aula14_aula15;

import java.util.Scanner;

public class Exerc23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um dos tipos de carne a ser comprada - File Duplo, Alcatra ou Picanha");
        System.out.println("Informe o peso(kg) a  comprar");
        System.out.println("Informe tipo de pagamento - Cartao Tabajara / Dinheiro / Outros");

        String tipo = scan.nextLine();
        double pesoProduto = scan.nextDouble();
        scan.nextLine();
        String formaPagamento = scan.nextLine();
        double valorAPagaar = 0;
        double valorDesconto = 0;

        if(pesoProduto <= 5){
            if(tipo.equalsIgnoreCase("File Duplo")){
                valorAPagaar = pesoProduto * 4.90;
            } else if(tipo.equalsIgnoreCase("Alcatra")){
                valorAPagaar = pesoProduto * 5.90;
            } else if(tipo.equalsIgnoreCase("Picanha")){
                valorAPagaar = pesoProduto * 6.90;
            }
        }else if(pesoProduto > 5){
            if(tipo.equalsIgnoreCase("File Duplo")){
                valorAPagaar = pesoProduto * 5.80;
            } else if(tipo.equalsIgnoreCase("Alcatra")){
                valorAPagaar = pesoProduto * 6.80;
            } else if(tipo.equalsIgnoreCase("Picanha")){
                valorAPagaar = pesoProduto * 7.80;
            }
        }

        if(formaPagamento.equalsIgnoreCase("Cartao Tabajara")){
            valorDesconto = valorAPagaar * 0.05;
        }

        valorAPagaar -=valorDesconto;

        System.out.println("Tipo da carne: "+tipo);
        System.out.println("Quantidade de carne: " +pesoProduto);
        System.out.println("Preco total: " +valorAPagaar);
        System.out.println("Tipo de pagamento: " +formaPagamento);
        System.out.println("Valor do desconto " +valorDesconto);
        System.out.println("Valor a pagar " +valorAPagaar);

    }
}
