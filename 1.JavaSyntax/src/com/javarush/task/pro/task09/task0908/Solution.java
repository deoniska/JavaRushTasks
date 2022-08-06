package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String tabHex(String hexStr) {
        String str = "";
        if (hexStr.equals("0000")) {
            return "0";
        }
        if (hexStr.equals("0001")) {
            return "1";
        }
        if (hexStr.equals("0010")) {
            return "2";
        }
        if (hexStr.equals("0011")) {
            return "3";
        }
        if (hexStr.equals("0100")) {
            return "4";
        }
        if (hexStr.equals("0101")) {
            return "5";
        }
        if (hexStr.equals("0110")) {
            return "6";
        }
        if (hexStr.equals("0111")) {
            return "7";
        }
        if (hexStr.equals("1000")) {
            return "8";
        }
        if (hexStr.equals("1001")) {
            return "9";
        }
        if (hexStr.equals("1010")) {
            return "a";
        }
        if (hexStr.equals("1011")) {
            return "b";
        }
        if (hexStr.equals("1100")) {
            return "c";
        }
        if (hexStr.equals("1101")) {
            return "d";
        }
        if (hexStr.equals("1110")) {
            return "e";
        }
        if (hexStr.equals("1111")) {
            return "f";
        }

        if (hexStr.equals("0")) {
            return "0000";
        }
        if (hexStr.equals("1")) {
            return "0001";
        }
        if (hexStr.equals("2")) {
            return "0010";
        }
        if (hexStr.equals("3")) {
            return "0011";
        }
        if (hexStr.equals("4")) {
            return "0100";
        }
        if (hexStr.equals("5")) {
            return "0101";
        }
        if (hexStr.equals("6")) {
            return "0110";
        }
        if (hexStr.equals("7")) {
            return "0111";
        }
        if (hexStr.equals("8")) {
            return "1000";
        }
        if (hexStr.equals("9")) {
            return "1001";
        }
        if (hexStr.equals("a")) {
            return "1010";
        }
        if (hexStr.equals("b")) {
            return "1011";
        }
        if (hexStr.equals("c")) {
            return "1100";
        }
        if (hexStr.equals("d")) {
            return "1101";
        }
        if (hexStr.equals("e")) {
            return "1110";
        }
        if (hexStr.equals("f")) {
            return "1111";
        }


        return null;
    }

    public static String toHex(String binaryNumber) {
        //напишите тут ваш код

        if (binaryNumber == null) {
            return "";
        }


        while (binaryNumber.length() % 4 != 0) {

            binaryNumber = 0 + binaryNumber;

        }
        String str = "";
        for (int i = 0; i < binaryNumber.length() / 4; i++) {
            String temp = tabHex(binaryNumber.substring(i * 4, i * 4 + 4));
            if (temp == null) {
                return "";
            }
            str = str + temp;
        }

        return str;
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        if (hexNumber == null) {
            return "";
        }
        String str = "";
        for (int i = 0; i < hexNumber.length(); i++) {
            String temp = tabHex(hexNumber.substring(i, i + 1));
            if (temp == null) {
                return "";
            }
            str = str + temp;
            // System.out.println(hexNumber.substring(i,i+1));
        }
        return str;
    }
}
