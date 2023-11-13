package com.javarush.task.pro.task03.task0318;

import java.util.Scanner; //11.11.23 - 10.11.23 (23 t) //под-дел.

/* 
Био-мясо
*/

public class Solution {
    public static String NOT_YET = "Искусственное мясо еще не готово.";
    public static String DONE = "Искусственное мясо готово.";
    public static String HORRIBLY_DONE = "Искусственное мясо превратилось в мясного монстра!";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        int a3 = (a1 * 60) + a2;
        int time = 30;
        String result = time == a3 ? (DONE) : time > a3 ? (NOT_YET) : (HORRIBLY_DONE);
        System.out.println(result);



    }
}
