package com.maxwareapps.structural.composite;

public class Division extends BinaryExpression {
    public Division(ArithmeticExpression left, ArithmeticExpression right) {
        super(left, right);
    }

    @Override
    public double calculate() {
        return left.calculate() / right.calculate();
    }
}
