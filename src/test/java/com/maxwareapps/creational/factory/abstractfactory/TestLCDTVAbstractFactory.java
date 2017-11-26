package com.maxwareapps.creational.factory.abstractfactory;

import com.maxwareapps.creational.factory.abstractfactory.*;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Abstract Factory Design Pattern (LCD TV Abstract Factory).
 *
 * Clients never create LCDTV objects directly, they ask the factory to do that for them.
 */
public class TestLCDTVAbstractFactory {
    @Test
    public void testCreateSonyLCDTV(){
        ITVAbstractFactory lcdtvAbstractFactory = LCDTVAbstractFactory.getFactory();
        ITV sonyLCDTV = lcdtvAbstractFactory.createSonyTV();
        Assert.assertThat(sonyLCDTV, new IsInstanceOf(SonyLCD.class));
    }

    @Test
    public void testCreateSamsungLCDTV(){
        ITVAbstractFactory lcdtvAbstractFactory = LCDTVAbstractFactory.getFactory();
        ITV samsungLCDTV = lcdtvAbstractFactory.createSamsungTV();
        Assert.assertThat(samsungLCDTV, new IsInstanceOf(SamsungLCD.class));
    }
}
