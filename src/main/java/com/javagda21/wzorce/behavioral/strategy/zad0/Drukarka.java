package com.javagda21.wzorce.behavioral.strategy.zad0;

public class Drukarka {
    private IFormatterCzcionki formatterCzcionki;

    public void setFormatterCzcionki(IFormatterCzcionki formatterCzcionki) {
        this.formatterCzcionki = formatterCzcionki;
    }

    public String reformat(String tekstDoPrzetworzenia) {
        return formatterCzcionki.zamienTekst(tekstDoPrzetworzenia);
    }

}


