package com.maxwareapps.creational.builder;

public class Salad {
    public enum SaladType{MOROCCAN,MEXICAN,ITALIAN}
    private SaladType saladType;
    private boolean oliveOil;
    private boolean fromage;

    public Salad(SaladType saladType, boolean oliveOil, boolean fromage) {
        this.saladType = saladType;
        this.oliveOil = oliveOil;
        this.fromage = fromage;
    }

    public SaladType getSaladType() {
        return saladType;
    }

    public boolean isOliveOil() {
        return oliveOil;
    }

    public boolean isFromage() {
        return fromage;
    }

    @Override
    public String toString() {
        return "Salad{" +
                "saladType=" + saladType +
                ", oliveOil=" + oliveOil +
                ", fromage=" + fromage +
                '}';
    }
}
