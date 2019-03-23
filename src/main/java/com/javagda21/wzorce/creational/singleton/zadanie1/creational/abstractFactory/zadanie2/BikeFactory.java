package com.javagda21.wzorce.creational.singleton.zadanie1.creational.abstractFactory.zadanie2;

public abstract class BikeFactory {

    public static Bike stworz1OsobowegoKrossa5przerzutek(){
        return new Bike("Kross", 1,5,BikeType.BICYClE);
    }

    public static Bike stworz1osobowegoSpecializedaZGearem(){
        return new Bike ("Speclaized",1,5,BikeType.BICYClE);
    }

    public static Bike stworz2OsobowegoKrossaBezGearu(){
        return new Bike("Kross",2,0,BikeType.TANDEM);
    }
}
