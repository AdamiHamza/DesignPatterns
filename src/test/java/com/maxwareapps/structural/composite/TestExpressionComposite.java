package com.maxwareapps.structural.composite;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Composite Design Pattern (Expression Composite).
 */
public class TestExpressionComposite {
    @Test
    public void testArithmeticExpression(){
        ArithmeticExpression arithmeticExpression = new Division(
                new Multiplication( new Negat(new Constant(5.0)),
                        new Division(new Constant(9.0),new Constant(6.0))
                ),
                new Addition(
                        new Constant(7.0),
                        new Substraction(new Constant(2.0),new Constant(1.5))
                )
        );
        Assert.assertEquals(-1.0,arithmeticExpression.calculate(),0.0);
    }
}
