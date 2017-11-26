package com.maxwareapps.creational.builder;

public class Sandwich {
    public enum SandwichType {GRILLED,COLESLAW,ROLLS,BACKED,PINWHEEL}
    private SandwichType sandwichType;
    private boolean fries;

    public Sandwich(SandwichType sandwichType, boolean fries) {
        this.sandwichType = sandwichType;
        this.fries = fries;
    }

    public SandwichType getSandwichType() {
        return sandwichType;
    }

    public boolean isFries() {
        return fries;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "sandwichType=" + sandwichType +
                ", fries=" + fries +
                '}';
    }
}
