package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел 26/11/23

*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner csr = new Scanner(System.in);
        int max = 0;
        int mini = Integer.MAX_VALUE;

        while (csr.hasNextInt()){
            int x = csr.nextInt();
            if(x > max){
                max = x;
            }
            if(x < mini){
                mini = x;
            }
        }

        System.out.println(mini);

    }
}