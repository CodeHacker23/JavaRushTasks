package com.javarush.task.pro.task04.task0422;

import java.util.Random;
import java.util.Scanner;

/* 
Баг в системе! 27.11.23 1 попыт сом
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        if (inputNumber <= 0) {
            System.out.println("Программа завершена. Введенное число должно быть больше 0.");
            return;
        }

        int count = 1;
      for (; true; ) {
          int randomNumber = new Random().nextInt(inputNumber + 1);
          if (inputNumber == randomNumber) {
              System.out.println("Попытка №" + count);
              break;
          }
          count++;
      }
    }
}