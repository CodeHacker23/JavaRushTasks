package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон? 05/12/23 +- попыт не сом
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        //напишите тут ваш код
        Scanner csr = new Scanner(System.in);
        if(csr.nextBoolean() == false){
            System.out.println((int)Math.floor(glass));
        }else {
            System.out.println((int)Math.ceil(glass));
        }




    }
}