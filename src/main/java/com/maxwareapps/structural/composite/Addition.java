package com.maxwareapps.structural.composite;

public class Addition extends BinaryExpression {

    public Addition(ArithmeticExpression left,ArithmeticExpression right) {
        super(left, right);
    }

    @Override
    public double calculate() {
        return left.calculate() + right.calculate();
    }
}
