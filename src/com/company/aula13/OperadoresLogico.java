package com.company.aula13;

public class OperadoresLogico {

    public static void main(String[] args) {

        int valor1 = 1;
        int valor2 = 2;

        // se ambos for igual  - sera true ou false
        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println("valor1 é 1 AND valor2 é 2 - resultado: " +resultado1);

        // se um deles for verdadeiro - sera true, para dar falso se ambos for falso
        boolean resultado2 = (valor1  == 1) || (valor2 == 2);
        System.out.println("valor1 é 1 OR valor2 é 2 - resultado " + resultado2);

        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println(verdadeiro && falso);
        // se um deles for verdadeiro - sera true  - pra dar falso ambos tem que ser falso
        System.out.println(verdadeiro || falso);
        // Condicao para ser falso se ambos for V AND V ou F AND F
        System.out.println(verdadeiro ^ falso);
        // Condicao para ser verdadeiro se ambos for verdadeiro, caso contrario false
        System.out.println(!verdadeiro && falso);

    }
}
