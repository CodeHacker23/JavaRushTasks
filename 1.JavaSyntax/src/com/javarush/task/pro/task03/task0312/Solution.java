package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки 14.11.23 cом 1 попыт
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner csr = new Scanner(System.in);
        String word1 = csr.nextLine();
        System.out.println();
        String word2 = csr.nextLine();
        System.out.println();

        if (word1.equals(word2)) {
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }
    }
}
