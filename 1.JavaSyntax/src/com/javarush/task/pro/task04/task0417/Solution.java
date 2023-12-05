package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра 05.12.23 сом 1 попыт
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner csr = new Scanner(System.in);
        int namberA = csr.nextInt();
        double namberB = 3.6;
        double sum = Math.round(namberA * namberB);
        int sum2 = (int)(sum);
        System.out.println(sum2);



    }
}