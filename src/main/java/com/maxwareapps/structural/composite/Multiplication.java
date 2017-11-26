package com.maxwareapps.structural.composite;

public class Multiplication extends BinaryExpression {

    public Multiplication(ArithmeticExpression left, ArithmeticExpression right) {
        super(left,right);
    }

    @Override
    public double calculate() {
        return left.calculate() * right.calculate();
    }
}
