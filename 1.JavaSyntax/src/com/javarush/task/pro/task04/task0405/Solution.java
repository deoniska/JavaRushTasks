package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int a = 10;

        while (a > 0) {
            int b = 20;
            while (b > 0) {
                if (a == 1 || a == 10) {
                    System.out.print("Б");
                } else {
                    if (b == 1 || b == 20) {
                        System.out.print("Б");
                    } else {
                        System.out.print(" ");
                    }
                }
                b--;
            }
            System.out.println();
            a--;
        }
        //напишите тут ваш код

    }
}