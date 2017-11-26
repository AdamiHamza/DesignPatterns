package com.maxwareapps.creational.factory.factorymethod;

import com.maxwareapps.creational.factory.factorymethod.ITV;
import com.maxwareapps.creational.factory.factorymethod.ITVFactory;
import com.maxwareapps.creational.factory.factorymethod.Samsung;
import com.maxwareapps.creational.factory.factorymethod.SamsungFactory;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Factory Method Design Pattern (Samsung Factory).
 *
 * The client is totally decoupled from the implementation details of derived classes.
 * Polymorphic creation is now possible.
 *
 */
public class TestSamsungFactory {
    @Test
    public void testCreateSonyTV(){
        ITVFactory samsungFactory = SamsungFactory.getFactory();
        ITV samsung = samsungFactory.createTV();
        Assert.assertThat(samsung, new IsInstanceOf(Samsung.class));
    }
}
