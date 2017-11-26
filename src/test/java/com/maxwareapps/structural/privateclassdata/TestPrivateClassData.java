package com.maxwareapps.structural.privateclassdata;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Private Class Data Design Pattern.
 */
public class TestPrivateClassData {

    @Test
    public void testPrivateClassData(){
        MainClass mainClass = new MainClass("Devil",666);
        Assert.assertEquals("Devil::666",mainClass.toString());
    }
}
