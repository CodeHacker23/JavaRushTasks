package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных 27.11.23 3 попыт не сом
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner csr = new Scanner(System.in);
        
        int mini = Integer.MAX_VALUE;
        int  secondMin = Integer.MAX_VALUE; //сделали минимальное самое число в переменной

        while (csr.hasNextInt()) {
            int x = csr.nextInt();

            if(x < mini){ //  присваеваем вводимое число  в переменную secondMin
                secondMin = mini;
                mini = x;
            } else if (x >  mini && x < secondMin) { //проверяем х больше мини и х меньше secondMin
                 secondMin = x;
            }
            

        }

        System.out.println( secondMin);

    }

    }
