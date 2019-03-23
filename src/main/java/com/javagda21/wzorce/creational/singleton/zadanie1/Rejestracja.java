package com.javagda21.wzorce.creational.singleton.zadanie1;

public class Rejestracja implements IGenerator{
    public int generujTicket() {
        return GeneratorTicketow.INSTANCE.pobierzNastepnyNumerek();
    }
}
