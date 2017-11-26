package com.maxwareapps.creational.factory.factorymethod;

import com.maxwareapps.creational.factory.factorymethod.ITV;
import com.maxwareapps.creational.factory.factorymethod.ITVFactory;
import com.maxwareapps.creational.factory.factorymethod.Sony;
import com.maxwareapps.creational.factory.factorymethod.SonyFactory;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Factory Method Design Pattern (Sony Factory).
 *
 * The client is totally decoupled from the implementation details of derived classes.
 * Polymorphic creation is now possible.
 *
 */
public class TestSonyFactory {
    @Test
    public void testCreateSonyTV(){
        ITVFactory sonyFactory = SonyFactory.getFactory();
        ITV sony = sonyFactory.createTV();
        Assert.assertThat(sony, new IsInstanceOf(Sony.class));
    }
}
