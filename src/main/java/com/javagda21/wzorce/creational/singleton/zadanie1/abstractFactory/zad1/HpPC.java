package com.javagda21.wzorce.creational.singleton.zadanie1.abstractFactory.zad1;

public class HpPC extends AbstractPC {

    public HpPC(String nazwaKomputera /* ComputerBrand computerBrand*/, int cpuPower, double gpuPower, boolean isOverclocked) {
        super(nazwaKomputera, ComputerBrand.HP, cpuPower, gpuPower, isOverclocked);
    }

    public static HpPC createHP1() {
        return new HpPC("1", 156, 5.00, true);
    }

    public static HpPC createHP2() {
        return new HpPC("1", 156, 5.00, true);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
