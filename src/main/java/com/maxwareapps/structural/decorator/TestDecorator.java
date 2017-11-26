package com.maxwareapps.structural.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        Insurance baseInsurance = new BaseInsurance("Base Insurance",1000);
        FireDamage fireDamage = new FireDamage(baseInsurance);
        CollisionDamage collisionDamage = new CollisionDamage(fireDamage);
        System.out.println(collisionDamage.getDescription());
        System.out.println(collisionDamage.getCost());
    }
}
