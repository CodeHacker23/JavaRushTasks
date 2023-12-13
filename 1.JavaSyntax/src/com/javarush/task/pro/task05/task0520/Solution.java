package com.javarush.task.pro.task05.task0520;

/* 
Переобуваемся на лету 06.12.23
вообще не понятно ничего про дебаг
*/

public class Solution {

    public static int result = 105;

    public static void main(String[] args) {
        byte correction = Byte.MAX_VALUE;
        for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {
            correction *= fahrenheit;
            System.out.println(correction);
        }
    }
}
