package com.maxwareapps.creational.prototype;

/**
 * Concrete Prototype (Rectangle)
 */
public class Rectangle implements Shape, PrototypeCapable{
    public Rectangle() {
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

    public Rectangle clone() throws CloneNotSupportedException {
       return (Rectangle) super.clone();
    }
}
