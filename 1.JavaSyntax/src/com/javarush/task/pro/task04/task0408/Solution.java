package com.javarush.task.pro.task04.task0408;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

/* 
Максимум из введенных чисел 24.11.23 не сом  3 попыт
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner csr = new Scanner(System.in);
        int max = Integer.MIN_VALUE;;

//        while (csr.hasNext()){ мое
//            int x = csr.nextInt();
//            if((x % 2) == 0 && x > max){
//                max = x;
//            } else if ((x%2)!=0) {
//                x = max;
//            }else {
//                x = max;
//            }
//        }
//        System.out.println(max);


        while (  csr.hasNextInt()) { //правильно реш намного короче, чем мое
            int x =  csr.nextInt();
            if (x % 2 == 0 && x > max) {
                max = x;
            }
        }
        System.out.println(max);


    }
}



