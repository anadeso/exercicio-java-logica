package com.company.aula20;

public class Matrizes3 {

    public static void main(String[] args) {

        int[][][] valoresMatrizes = new int[3][3][3];

        for(int i=0; i<valoresMatrizes.length; i++){
            for(int j=0; j<valoresMatrizes[i].length; j++){
                for(int k=0; k<valoresMatrizes[j].length; k++ ){
                    valoresMatrizes[i][j][k] = i + j + k;
                }
            }
        }

        int soma = 0;
        int totalPares = 0;
        int totalImpares = 0;
        for(int i=0; i<valoresMatrizes.length; i++){
            for(int j=0; j<valoresMatrizes[i].length; j++){
                for(int k=0; k<valoresMatrizes[j].length; k++){

                    soma += valoresMatrizes[i][j][k];

                    if(valoresMatrizes[i][j][k] % 2 == 0){
                        totalPares += valoresMatrizes[i][j][k];
                    }else{
                        totalImpares += valoresMatrizes[i][j][k];
                    }
                }

            }

        }

        System.out.println("Soma " +soma);
        System.out.println("Total pares " +totalPares);
        System.out.println("Total impares " +totalImpares);

    }

}
