package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (secret.toUpperCase().equals(line.toUpperCase())) {

            //напишите тут ваш код
            System.out.println("доступ разрешен");
        }
        //напишите тут ваш код
        else {
            System.out.println("доступ запрещен");
        }
    }
}
