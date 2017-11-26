package com.maxwareapps.creational.builder;

public class Pizza {
    public enum PizzaType{BAGEL,BIANCA,KEBAB,NEAPOLITAN}
    private PizzaType pizzaType;
    private boolean spicy;

    public Pizza(PizzaType pizzaType, boolean spicy) {
        this.pizzaType = pizzaType;
        this.spicy = spicy;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public boolean isSpicy() {
        return spicy;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaType=" + pizzaType +
                ", spicy=" + spicy +
                '}';
    }
}
