package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 1;
        int sum =0;
        while (i < 101) {

            if(i%3==0) {
                i++;
                continue;
            }
            sum=sum+i;
            i++;

        }
        System.out.println(sum);
    }
}