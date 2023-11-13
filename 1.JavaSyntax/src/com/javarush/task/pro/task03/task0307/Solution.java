package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос //13.11.23 сам
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner csr = new Scanner(System.in);
        int age = csr.nextInt();

        if(age < 20  || age > 60 || age < 19 ){
            System.out.println("можно не работать");

        }

    }
}
