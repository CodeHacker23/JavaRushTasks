package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование с 11 попыт с помощью ии
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner csr = new Scanner(System.in);
        int sum = 0;
        String text = "ENTER";

        while (true) {
             String a = csr.nextLine();
             if(a.equals(text)){
                 break;
             }
            int number = Integer.parseInt(a);
            sum += number;

        }

        System.out.println(sum);



    }
}



