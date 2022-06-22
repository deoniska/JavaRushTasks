package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        int summ = 0;
        Scanner scanner = new Scanner(System.in);
        Boolean flag = true;
        while (flag) {
            if (scanner.hasNextInt())
                summ = summ + scanner.nextInt();
                //напишите тут ваш код
            else if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("ENTER")) {
                    flag = false;
                }
            }
        }

        System.out.println(summ);


    }
}