package com.maxwareapps.structural.decorator;

public class FireDamage extends InsuranceDecorator {

    public FireDamage(Insurance insurance) {
        super(insurance);
    }

    @Override
    public double getCost() {
        return insurance.getCost() + 200;
    }

    @Override
    public String getDescription() {
        return insurance.getDescription() + " + Fire Damage Insurance";
    }
}
