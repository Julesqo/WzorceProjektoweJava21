package com.javagda21.wzorce.behavioral.strategy.zad0;

public class FormatterLower implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZmiany) {
        return tekstDoZmiany.toLowerCase();
    }
}
