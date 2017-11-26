package com.maxwareapps.structural.bridge;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Bridge Design Pattern (Rendering Bridge).
 */
public class TestRendererBridge {

    @Test
    public void testCircleDrawing(){
        Shape redCircle = new Circle(2,5,10,new RedCircleRenderer());
        Shape blueCircle = new Circle(2,5,10,new BlueCircleRenderer());
        Assert.assertEquals("Red Circle Drawing", redCircle.draw());
        Assert.assertEquals("Blue Circle Drawing", blueCircle.draw());
    }
}
