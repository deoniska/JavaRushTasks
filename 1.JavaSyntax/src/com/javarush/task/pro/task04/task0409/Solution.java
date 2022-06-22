package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int min = 2147483647;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int a = scanner.nextInt();
                if(a<min){
                    min=a;
            }
                } else {
                break;
            }
        }
        System.out.println(min);
    }
}