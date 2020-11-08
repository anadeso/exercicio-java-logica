package com.company.aula16;

public class LoopWhile {

    public static void main(String[] args) {

        //int contador = 0;
        int x = 0;

        while(x <= 10){
            System.out.println("O valor de x é "+x);
            x++;
        }


        System.out.println(x);

        do{
            x++;
            System.out.println("O valor é no do-while "+x);

        }while (x < 14);

        System.out.println(x);
    }
}
