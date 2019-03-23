package com.javagda21.wzorce.creational.singleton.zadanie1;

public class GeneratorTicketow {
    private static GeneratorTicketow ourInstance = new GeneratorTicketow();

    public static GeneratorTicketow getInstance() {
        return ourInstance;
    }

    private GeneratorTicketow() {
    }
}
