package com.maxwareapps.creational.factory.abstractfactory;

import com.maxwareapps.creational.factory.abstractfactory.*;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for Abstract Factory Design Pattern (LED TV Abstract Factory).
 *
 * Clients never create LEDTV objects directly, they ask the factory to do that for them.
 */
public class TestLEDTVAbstractFactory {
    private static ITVAbstractFactory ledtvAbstractFactory;

    @BeforeClass
    public static void init(){
        ledtvAbstractFactory = LEDTVAbstractFactory.getFactory();
    }

    @Test
    public void testCreateSonyLEDTV(){
        ITV sonyLEDTV = ledtvAbstractFactory.createSonyTV();
        Assert.assertThat(sonyLEDTV, new IsInstanceOf(SonyLED.class));
    }

    @Test
    public void testCreateSamsungLEDTV(){
        ITV samsungLEDTV = ledtvAbstractFactory.createSamsungTV();
        Assert.assertThat(samsungLEDTV, new IsInstanceOf(SamsungLED.class));
    }
}
