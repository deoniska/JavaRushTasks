package com.javarush.task.pro.task10.task1016;

/* 
Прогноз погоды
*/

public class Solution {

    public static void showWeather(City city) {
        //напишите тут ваш код
        System.out.println("В городе " + city.getName()+ " сегодня температура воздуха " + city.getTemperature() );
    }

    public static void main(String[] args) {
       showWeather(new City("Moscow",13)); //напишите тут ваш код
    }
}
