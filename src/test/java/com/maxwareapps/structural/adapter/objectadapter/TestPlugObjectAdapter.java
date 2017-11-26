package com.maxwareapps.structural.adapter.objectadapter;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Adapter Design Pattern (Plug Object Decorator).
 *
 * The client uses (is coupled to) the new interface
 *
 */
public class TestPlugObjectAdapter {
    @Test
    public void testVoltAdapting(){
        PlugAdapter plugAdapter = new PlugObjectAdapterImpl(new Plug());
        Volt volt = plugAdapter.get24Volt();
        Assert.assertEquals(24,volt.getVolt());
        volt = plugAdapter.get12Volt();
        Assert.assertEquals(12,volt.getVolt());
        volt = plugAdapter.get240Volt();
        Assert.assertEquals(240,volt.getVolt());
    }
}
