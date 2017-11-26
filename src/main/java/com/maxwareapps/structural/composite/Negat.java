package com.maxwareapps.structural.composite;

public class Negat extends UnaryExpression{
    public Negat(ArithmeticExpression right) {
        super(right);
    }

    @Override
    public double calculate() {
        return -right.calculate();
    }
}
