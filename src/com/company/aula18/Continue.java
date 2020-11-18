package com.company.aula18;

import java.util.Scanner;

public class Continue {

    // Continue o loop na proxima iteracao
    // Usado para continue pouco mais raro
    // for aninhados o uso cai bem com continue, para pular o for interno
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero");
        int num = scan.nextInt();

        System.out.println("Entre com um limite");
        int max = scan.nextInt();

        for(int i=num; i<=max; i++){
            if(i%7 == 0){
                continue;
            }
            System.out.println("O valor de i " +i);
        }

    }
}
