package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner csr = new Scanner(System.in);
        int namberA = csr.nextInt();
        int sum = 0;
        String text = "ENTER";

        while (true) {

                String a = csr.nextLine();
                if (a.equals(text)) {
                    break;
                }
                sum = sum + namberA;
                namberA --;
            }

        System.out.println(sum);



    }
}