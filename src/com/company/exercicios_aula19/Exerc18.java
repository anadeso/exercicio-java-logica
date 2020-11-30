package com.company.exercicios_aula19;

import java.util.Scanner;

public class Exerc18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // veja que estamos trabalhando, nao precisamos fazer dessa maneira
        /*int maior = Integer.MAX_VALUE;
        int menor = Integer.MIN_VALUE;*/
        int[] vetorA = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com a idade na posicao " +(i+1));
            vetorA[i] = scan.nextInt();
        }

        int menorIdade = vetorA[0];
        int indexMenor = 0;
        int maiorIdade = vetorA[0];
        int indexMaior = 0;
        for(int i=1; i<vetorA.length; i++){

            if(vetorA[i] > maiorIdade){
                maiorIdade = vetorA[i];
                indexMaior = i;
            } else if (vetorA[i] < menorIdade){
                menorIdade = vetorA[i];
                indexMenor = i;
            }
        }

        System.out.println("Idade maior " +maiorIdade);
        System.out.println("Idade menor " +menorIdade);
    }
}
