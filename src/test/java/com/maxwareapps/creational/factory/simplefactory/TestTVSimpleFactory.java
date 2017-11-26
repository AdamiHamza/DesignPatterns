package com.maxwareapps.creational.factory.simplefactory;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for Simple Factory Pattern.
 */
public class TestTVSimpleFactory {
    private TVSimpleFactory tvSimpleFactory;


    @Before
    public void setup(){
        tvSimpleFactory = TVSimpleFactory.getFactory();
    }

    @Test
    public void testCreateToshibaTV(){
        ITV toshiba = tvSimpleFactory.newTV(TVSimpleFactory.TVMODEL.TOSHIBA);
        Assert.assertThat(toshiba, new IsInstanceOf(Toshiba.class));
    }

    @Test
    public void testCreateSamsungTV(){
        ITV samsung = tvSimpleFactory.newTV(TVSimpleFactory.TVMODEL.SAMSUNG);
        Assert.assertThat(samsung, new IsInstanceOf(Samsung.class));
    }

    @Test
    public void testCreateSonyTV(){
        ITV sony = tvSimpleFactory.newTV(TVSimpleFactory.TVMODEL.SONY);
        Assert.assertThat(sony, new IsInstanceOf(Sony.class));
    }

}
