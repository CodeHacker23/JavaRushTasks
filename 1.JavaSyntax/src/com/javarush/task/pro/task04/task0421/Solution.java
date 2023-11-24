package com.javarush.task.pro.task04.task0421;

/*
Охлаждение ядра планеты 24.11.23 почти сом 2 попыт
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int namberA = 1;
        int sum = 0;

        while (namberA <= 100){

            if((namberA % 2) == 0){
                sum += namberA;
            }
           
            namberA++;
        }
        System.out.println(sum);

    }
}