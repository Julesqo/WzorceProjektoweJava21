package com.javagda21.wzorce.creational.singleton.zadanie1.abstractFactory.zad1;

public class SamsungPC extends AbstractPC {


    public SamsungPC(String nazwaKomputera /*ComputerBrand computerBrand8*/, int cpuPower, double gpuPower, boolean isOverclocked) {
        super(nazwaKomputera, ComputerBrand.SAMSUNG, cpuPower, gpuPower, isOverclocked);
    }

    public static  SamsungPC createSamsungPro(){
        return new SamsungPC("Pro",123,25.00, false);
    }

    public static SamsungPC createSamsungSiabadaba(){
        return new SamsungPC("siabada",123,25.00, false);
    }

}
