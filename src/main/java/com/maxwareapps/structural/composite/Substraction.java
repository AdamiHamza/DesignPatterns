package com.maxwareapps.structural.composite;

public class Substraction extends BinaryExpression {

    public Substraction(ArithmeticExpression left, ArithmeticExpression right) {
        super(left,right);
    }

    @Override
    public double calculate() {
        return left.calculate() - right.calculate();
    }
}
