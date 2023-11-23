package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем 23/11/23 1 попыт сом
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner csr = new Scanner( System.in);
        String text = "enough";
        String  a ;

        while (true){
            a = csr.nextLine();
            if(a.equals(text)){
                System.out.println();
                break;
            }
            System.out.println(a);


        }



    }
}