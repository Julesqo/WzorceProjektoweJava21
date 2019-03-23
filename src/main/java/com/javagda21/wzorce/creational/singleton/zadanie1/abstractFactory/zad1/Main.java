package com.javagda21.wzorce.creational.singleton.zadanie1.abstractFactory.zad1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HpPC komputerHP1 = HpPC.createHP1();
        AsusPC komputerAsusH23 = AsusPC.createAsusH23();
        SamsungPC komputerSamsungPro = SamsungPC.createSamsungPro();

        List<AbstractPC> listaKompow = new ArrayList<>();
        listaKompow.add(komputerAsusH23);
        listaKompow.add(komputerHP1);
        listaKompow.add(komputerSamsungPro);


        for (AbstractPC a:  listaKompow  ) {
            System.out.println(a);

        }
    }
}
