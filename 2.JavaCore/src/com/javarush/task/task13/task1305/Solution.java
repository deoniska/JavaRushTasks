package com.javarush.task.task13.task1305;

/* 
Четыре ошибки
*/

import static com.javarush.task.task13.task1305.Solution.Dream.HOBBY;

public class Solution {

    public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
        static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Dream, Desire {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
