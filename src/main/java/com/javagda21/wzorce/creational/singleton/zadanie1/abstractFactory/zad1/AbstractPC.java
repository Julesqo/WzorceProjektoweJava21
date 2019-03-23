package com.javagda21.wzorce.creational.singleton.zadanie1.abstractFactory.zad1;

public abstract class AbstractPC {
    private String nazwaKomputera;
    private ComputerBrand computerBrand;
    private int cpuPower;
    private double gpuPower;
    private boolean isOverclocked;

    public AbstractPC(String nazwaKomputera, ComputerBrand computerBrand, int cpuPower, double gpuPower, boolean isOverclocked) {
        this.nazwaKomputera = nazwaKomputera;
        this.computerBrand = computerBrand;
        this.cpuPower = cpuPower;
        this.gpuPower = gpuPower;
        this.isOverclocked = isOverclocked;
    }

    @Override
    public String toString() {
        return "AbstractPC{" +
                "nazwaKomputera='" + nazwaKomputera + '\'' +
                ", computerBrand=" + computerBrand +
                ", cpuPower=" + cpuPower +
                ", gpuPower=" + gpuPower +
                ", isOverclocked=" + isOverclocked +
                '}';
    }
}
