package com.maxwareapps.creational.builder;

public class Drink {
    public enum DrinkType{COCK,JUS,TEA}

    private DrinkType drinkType;
    private boolean sugar;
    private boolean extraSugar;

    public Drink(DrinkType drinkType, boolean sugar, boolean extraSugar) {
        this.drinkType = drinkType;
        this.sugar = sugar;
        this.extraSugar = extraSugar;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public boolean isSugar() {
        return sugar;
    }

    public boolean isExtraSugar() {
        return extraSugar;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "drinkType=" + drinkType +
                ", sugar=" + sugar +
                ", extraSugar=" + extraSugar +
                '}';
    }
}
