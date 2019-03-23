package com.javagda21.wzorce.creational.singleton.zadanie1.Builder.Zad2;

public class Main {

    public static void main(String[] args) {
        Stamp.Builder builder = new Stamp.Builder();


        Stamp stamp = builder
                .setFirstDayNumber(1)
                .setSecondDayNumber(2)
                .setFirstMonthNumber(0)
                .setSecondMonthNumber(3)
                .setYearNumber1(2)
                .setYearNumber2(0)
                .setYearNumber3(1)
                .setYearNumber4(9)
                .setCaseNumber(20)
                .createStamp();



    }
}
