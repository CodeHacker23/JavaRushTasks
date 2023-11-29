package com.javarush.task.pro.task04.task0423;

import java.util.Scanner;

/* 
Калибровка климата 28/11/23 1 попыт сом

*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //напишите тут ваш код
        int namberA;
        int sum = 0;

        for ( int i = 0; i < 5; i++){
            namberA = scanner.nextInt();
            sum += namberA;
        }
        int c = sum / 5;
        System.out.println(c);
    }
}
