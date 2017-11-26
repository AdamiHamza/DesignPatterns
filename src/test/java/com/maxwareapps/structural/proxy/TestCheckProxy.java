package com.maxwareapps.structural.proxy;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Proxy Design Pattern (Check Payment Proxy).
 */
public class TestCheckProxy {

    @Test
    public void testPayment(){
        Payment payment = new CheckProxy(10000);
        Assert.assertEquals(1000,payment.withdrawal(1000),0);
        Assert.assertEquals(1000,payment.withdrawal(1000),0);
        Assert.assertEquals(0,payment.withdrawal(9000),0);
    }
}
