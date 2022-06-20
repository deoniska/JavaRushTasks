package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();

        if (Math.abs(first - second) < 0.000001) {
            System.out.println("числа равны");
            //напишите тут ваш код
        } else {
            System.out.println("числа не равны");
        }

    }
}
