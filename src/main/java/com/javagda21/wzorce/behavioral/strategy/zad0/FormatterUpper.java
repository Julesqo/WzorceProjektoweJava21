package com.javagda21.wzorce.behavioral.strategy.zad0;

public class FormatterUpper implements IFormatterCzcionki {


    @Override
    public String zamienTekst(String tekstDoZmiany) {
        return tekstDoZmiany.toUpperCase();
    }
}
