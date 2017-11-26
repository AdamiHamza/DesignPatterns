package com.maxwareapps.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite
 */
public class CompositeOperande implements ArithmeticExpression {
    private List<ArithmeticExpression> arithmeticExpressions = new ArrayList<ArithmeticExpression>();


    private  void addExp(ArithmeticExpression arithmeticExpression){
        arithmeticExpressions.add(arithmeticExpression);
    }

    private void removeExp(ArithmeticExpression arithmeticExpression){
        arithmeticExpressions.remove(arithmeticExpression);
    }

    @Override
    public double calculate() {
        return 0;
    }
}
