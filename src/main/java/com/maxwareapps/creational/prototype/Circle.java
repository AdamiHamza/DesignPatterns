package com.maxwareapps.creational.prototype;


/**
 * Concrete Prototype (Circle)
 *
 * Circle knows how to spawn new instances of itself.
 *
 */
public class Circle implements Shape, PrototypeCapable {
    public Circle() {

    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

    /**
     * @return a clone of it self
     * @throws CloneNotSupportedException throw an exception if clone unsupported.
     */
    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
