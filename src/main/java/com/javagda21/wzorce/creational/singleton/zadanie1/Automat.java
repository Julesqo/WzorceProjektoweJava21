package com.javagda21.wzorce.creational.singleton.zadanie1;

public class Automat implements IGenerator {

    public int generujTicket() {
        return GeneratorTicketow.INSTANCE.pobierzNastepnyNumerek();
    }
}
