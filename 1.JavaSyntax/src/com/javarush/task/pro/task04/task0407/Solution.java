package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3 23.11.23 2 попыт сом
*/



public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        int namberA = 0;
        int sum = 0;
        while (namberA <= 100) {

            if ((namberA % 3) == 0) {
                namberA++;
                continue;

            }
             sum += namberA;
            namberA++;
        }
        System.out.println(sum);




    }
}