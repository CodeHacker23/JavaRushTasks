package com.javarush.task.pro.task04.task0419;

import java.util.Scanner;

/* 
Защита от землетрясения 16.11.23 1 попыт сом
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0){
            if(number <= 0){
                System.out.println( 0 );
            }

            sum = sum + number;
            number --;
        }



        //напишите тут ваш код
        System.out.println(sum);
    }
}