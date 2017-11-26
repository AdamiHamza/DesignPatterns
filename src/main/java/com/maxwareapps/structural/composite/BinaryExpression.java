package com.maxwareapps.structural.composite;

public abstract class BinaryExpression extends UnaryExpression {
    protected ArithmeticExpression left;

    public BinaryExpression(ArithmeticExpression left,ArithmeticExpression right) {
        super(right);
        this.left = left;
    }
}
