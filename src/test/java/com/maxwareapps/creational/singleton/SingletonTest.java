package com.maxwareapps.creational.singleton;

import com.maxwareapps.creational.signleton.Singleton;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Singleton Design Pattern.
 *
 * The client calls the accessor function (using the class name and scope resolution operator)
 * whenever a reference to the single instance is required.
 *
 */
public class SingletonTest{
    @Test
    public void testSingletonInstance(){
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Assert.assertSame(instance1,instance2);
    }
}
