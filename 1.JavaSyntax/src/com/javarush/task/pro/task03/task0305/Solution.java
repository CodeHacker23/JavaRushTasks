package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа 08.11.23
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scr = new Scanner(System.in);

        int one = scr.nextInt();
        int two = scr.nextInt();
        int three = scr.nextInt();

         if(one == two && one == three){
             System.out.print(one);
             System.out.print(two);
             System.out.print(three);

         }else if (one == three){
             System.out.print(one);
             System.out.print(three);

         }else if (two == three) {
             System.out.print(two);
             System.out.print(three);

         } else if(one == two ) {
             System.out.print(one);
             System.out.print(two);
         }

    }
}

