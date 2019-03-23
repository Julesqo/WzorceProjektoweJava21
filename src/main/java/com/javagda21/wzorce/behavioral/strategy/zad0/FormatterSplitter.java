package com.javagda21.wzorce.behavioral.strategy.zad0;

public class FormatterSplitter implements IFormatterCzcionki {
    @Override

    public String zamienTekst(String tekstDoZmiany) {

        char[] chars = tekstDoZmiany.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();        for (int i = 0; i < chars.length; i++) {

            stringBuilder.append(chars[i]);

            stringBuilder.append(" ");

        }        return stringBuilder.toString();

    }

}
