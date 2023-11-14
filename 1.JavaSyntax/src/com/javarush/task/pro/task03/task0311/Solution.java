package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность // 2 попыт 14.11.23 сом
*/

public class Solution {
    public static void main(String[] args) {
        Scanner csr = new Scanner(System.in);
        double numberA = csr.nextDouble();
        double numberB = csr.nextDouble();

        if(Math.abs(numberA - numberB)  < 0.000001 ){
            System.out.println("числа равны");
        }else {
            System.out.println("числа не равны");
        }




    }
}
