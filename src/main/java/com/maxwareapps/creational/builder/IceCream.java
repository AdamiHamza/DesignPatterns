package com.maxwareapps.creational.builder;

public class IceCream {
    public enum IceCreamType{BIO,SIMPLE,MIXTE}
    private IceCreamType iceCreamType;
    private boolean topping;
    private boolean inCorn;
    private boolean dryFruits;

    public IceCream(IceCreamType iceCreamType, boolean topping, boolean inCorn, boolean dryFruits) {
        this.iceCreamType = iceCreamType;
        this.topping = topping;
        this.inCorn = inCorn;
        this.dryFruits = dryFruits;
    }

    public IceCreamType getIceCreamType() {
        return iceCreamType;
    }

    public boolean isTopping() {
        return topping;
    }

    public boolean isInCorn() {
        return inCorn;
    }

    public boolean isDryFruits() {
        return dryFruits;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "iceCreamType=" + iceCreamType +
                ", topping=" + topping +
                ", inCorn=" + inCorn +
                ", dryFruits=" + dryFruits +
                '}';
    }
}
