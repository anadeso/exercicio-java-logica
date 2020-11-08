package com.company.exercicios_aula13;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class PesoIdeal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a altura: ");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("O peso ideal é: " +pesoIdeal);

    }
}
