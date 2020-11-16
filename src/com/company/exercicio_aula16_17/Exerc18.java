package com.company.exercicio_aula16_17;

import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Exerc18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero ");
        int num = scan.nextInt();

        boolean primo = true;
        for(int i=2; i<num; i++){
            if(num%i == 0){
                System.out.println("Nao é primo - divisivel por " +i);
                primo = false;
            }

            if(primo){
                System.out.println("Numero primo");
            }
        }
    }
}
