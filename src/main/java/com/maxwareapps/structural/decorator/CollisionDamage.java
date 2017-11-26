package com.maxwareapps.structural.decorator;

public class CollisionDamage extends InsuranceDecorator {
    public CollisionDamage(Insurance insurance) {
        super(insurance);
    }

    @Override
    public double getCost() {
        return insurance.getCost() + 100;
    }

    @Override
    public String getDescription() {
        return insurance.getDescription()+ " + Collision Damage Insurance";
    }
}
