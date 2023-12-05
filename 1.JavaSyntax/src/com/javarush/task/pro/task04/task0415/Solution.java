package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга 05.12.23 не сом 2 попыт
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner csr = new Scanner(System.in);
         int radius = csr.nextInt();
        double pi = 3.14;
        // int r2 = (int)(pi);
        int sum = (int) (pi * radius * radius);


        System.out.println(sum);



    }
}