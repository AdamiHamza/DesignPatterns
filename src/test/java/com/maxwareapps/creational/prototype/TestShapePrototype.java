package com.maxwareapps.creational.prototype;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Prototype Design Pattern (Shape Builder).
 *
 * The client, instead of writing code that invokes the "new" operator on a hard-wired class name,
 * calls a "clone" operation on the abstract base class, supplying a string or enumerated data type
 * that designates the particular concrete derived class desired.
 */
public class TestShapePrototype {
    @Test
    public void testPrototype(){
        IPrototypeFactory shapeFactory = PrototypeFactory.getFactory();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        shapeFactory.register("Circle",circle);
        shapeFactory.register("Rectangle",rectangle);
        try {
            PrototypeCapable circleProto = shapeFactory.getShape("Circle");
            PrototypeCapable rectangleProto = shapeFactory.getShape("Rectangle");
            Assert.assertNotSame(circle,circleProto);
            Assert.assertNotSame(circle,rectangleProto);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
