package com.company.exercicio_aula14_aula15;

import java.util.Scanner;

public class Exerc15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 3 lados de m triângulo ");

        double lado1 = scan.nextDouble();
        double lado2 = scan.nextDouble();
        double lado3 = scan.nextDouble();

        double somaTriangulo = lado1 + lado2;

       if (((lado1 + lado2) > lado3) ||
                       ((lado1 + lado3) > lado2) ||
                       ((lado2 + lado1) > lado1)){

           if(lado1 == lado2 && lado1 ==lado3 && lado3 == lado2){
               System.out.println("Equilatero");
           } else if(lado1!= lado2 && lado1 != lado3 & lado3 != lado2){
               System.out.println("Escaleno");
           } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
               System.out.println("Isoceles");
           }
       } else{
           System.out.println("Nao forma um triangulo");
       }
    }
}
