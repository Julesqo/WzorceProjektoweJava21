package com.javagda21.wzorce.creational.singleton.zadanie1.abstractFactory.zad1;

public class AsusPC extends AbstractPC {

    public AsusPC(String nazwaKomputera/*ComputerBrand computerBrand*/, int cpuPower, double gpuPower, boolean isOverclocked) {
        super(nazwaKomputera, ComputerBrand.ASUS, cpuPower, gpuPower, isOverclocked);
    }

    public static AsusPC createAsusN53() {
        return new AsusPC("N53", 123, 20.00, true);
    }

    public static AsusPC createAsusH23() {
        return new AsusPC("H23", 153, 10.00, false);
    }


}
