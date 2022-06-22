package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int min = 2147483647;
        int count = 0;
        int secondmin = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                int a = scanner.nextInt();
                count++;
                if (a < min) {
                    secondmin = min;
                    min = a;
                } else if (a < secondmin && a != min) {
                    secondmin = a;
                }

            } else if (count < 2) {
                break;
            } else {
                System.out.println(secondmin);
                break;
            }
        }
    }
}