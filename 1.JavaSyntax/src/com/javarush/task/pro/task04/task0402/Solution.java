package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу 16.11.23 1 попыт сом
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";
        //напишите тут ваш код
        Scanner csr = new Scanner (System.in);
        String name = csr.nextLine();

        int namberA = 0;

        while (namberA ++ < 10 ) {
            System.out.println(name + text);
        }



    }
}
