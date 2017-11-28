package com.maxwareapps.behavioral.chainofresponsability;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for Chain Of Responsibility Design Pattern (Dispense Chain).
 */
public class TestDispenseChain {

    private static DispenseChain firstChain;

    @BeforeClass
    public static void init(){
        // initialize the chain
        firstChain = new USD100Dispenser();
        DispenseChain secondChain = new USD50Dispenser();
        DispenseChain thirdChain = new USD20Dispenser();
        DispenseChain fourthChain = new USD10Dispenser();

        // set the chain of responsibility
        firstChain.addChain(secondChain);
        secondChain.addChain(thirdChain);
        thirdChain.addChain(fourthChain);
    }

    @Test
    public void testChain(){
        Currency currency = new Currency(50);
        firstChain.dispense(currency);
        Assert.assertEquals(0,currency.getAmount());
        currency = new Currency(60);
        firstChain.dispense(currency);
        Assert.assertEquals(0,currency.getAmount());
        currency = new Currency(170);
        firstChain.dispense(currency);
        Assert.assertEquals(0,currency.getAmount());
    }

}
