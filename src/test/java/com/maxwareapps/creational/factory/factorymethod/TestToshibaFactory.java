package com.maxwareapps.creational.factory.factorymethod;

import com.maxwareapps.creational.factory.factorymethod.ITV;
import com.maxwareapps.creational.factory.factorymethod.ITVFactory;
import com.maxwareapps.creational.factory.factorymethod.Toshiba;
import com.maxwareapps.creational.factory.factorymethod.ToshibaFactory;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Factory Method Design Pattern (Toshiba Factory).
 *
 * The client is totally decoupled from the implementation details of derived classes.
 * Polymorphic creation is now possible.
 *
 */
public class TestToshibaFactory {
    @Test
    public void testCreateToshibaTV(){
        ITVFactory toshibaFactory = ToshibaFactory.getFactory();
        ITV toshiba = toshibaFactory.createTV();
        Assert.assertThat(toshiba, new IsInstanceOf(Toshiba.class));
    }
}
