package com.javarush.task.pro.task04.task0424;

import java.util.Scanner;

/* 
Бомба в ядре планеты 4 попыт /29.11.23 сом
*/

public class Solution {
    public static void main(String[] args) {
        Scanner bombInterface = new Scanner(System.in);
        int a;
        //напишите тут ваш код
        do {
           a = bombInterface.nextInt();
            System.out.println(a);
        }while (( a % 10) != 0);

    }
}
