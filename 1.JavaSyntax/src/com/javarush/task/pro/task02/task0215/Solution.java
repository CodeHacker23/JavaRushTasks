package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел 26/10/23
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner csr = new Scanner(System.in);
        int a = csr.nextInt();
        int b = csr.nextInt();
        int c = csr.nextInt();
        int d = (a + b + c) / 3;

        System.out.println(d);

    }
}
