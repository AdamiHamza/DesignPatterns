package com.maxwareapps.structural.facade;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Facade Design Pattern (Customer Service Facade).
 */
public class TestCustomerServiceFacade {

    @Test
    public void testCustomerServiceFacade(){
        CustomerServiceFacade customerServiceFacade = new CustomerServiceFacade();
        Assert.assertEquals("Billing", customerServiceFacade.billOrder());
        Assert.assertEquals("FullFilling", customerServiceFacade.fullFillOrder());
        Assert.assertEquals("Shipping", customerServiceFacade.shipOrder());
    }
}
