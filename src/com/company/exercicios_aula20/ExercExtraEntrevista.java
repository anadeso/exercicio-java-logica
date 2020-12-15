package com.company.exercicios_aula20;
/*
  Problem Description: Given an array of n integers, determines whether there is a pair
   of elements in the array that sums to exactly 15.

          Input : A[] = [-5, 1, -40, 20, 6, 8, 7 ]
*/

import java.util.HashSet;

public class ExercExtraEntrevista {

    public static void main(String[] args) {

        int[]A = {-5, 1, -40, 20, 6, 8, 7 };
        int n = 15;
        imprimaPares(A, n);

    }

    public static void imprimaPares(int[] arr, int sum){

        HashSet<Integer> s = new HashSet<Integer>();

        int temp;

        for(int i=0; i<arr.length; i++){

            temp = sum - arr[i];

            if(s.contains(temp)){
                System.out.println("Pair with given sum "  + sum + " é (" +
                        arr[i] + ", " + temp + ") " );
            }
            s.add(arr[i]);

        }

    }

}
