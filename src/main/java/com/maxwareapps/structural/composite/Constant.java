package com.maxwareapps.structural.composite;

public class Constant implements ArithmeticExpression {
    double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    public double calculate() {
        return value;
    }
}
