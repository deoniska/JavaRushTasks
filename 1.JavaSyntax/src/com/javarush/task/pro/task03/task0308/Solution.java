package com.javarush.task.pro.task03.task0308;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        if(x>0&&y>0) {
            System.out.println(1);
        } else if (x<0&&y>0) {
            System.out.println(2);
        }else if (x<0&&y<0) {
            System.out.println(3);
        } else if (x>0&&y<0) {
            System.out.println(4);
        } else {
            System.out.println("it is fail");
        }
    }
}
