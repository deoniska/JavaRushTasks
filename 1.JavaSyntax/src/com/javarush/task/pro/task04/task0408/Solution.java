package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int max = -2147483648;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int a = scanner.nextInt();
                if (a % 2 == 0 && a > max) {
                    max = a;
                }
            } else {
                break;
            }
        }
        System.out.println(max);
    }
}