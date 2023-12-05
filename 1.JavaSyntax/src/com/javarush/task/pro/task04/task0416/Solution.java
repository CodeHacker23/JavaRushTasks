package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke 1 05.12.23 сом 1 попыт
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner csr = new Scanner(System.in);
        int  quantity = csr.nextInt();//количество
        int quantityName = csr.nextInt();// кол-во людей

        double a  = (double)(quantity);
        double b  = (double)(quantityName);

        double sum = a / b;

        System.out.println(sum);

    }
}