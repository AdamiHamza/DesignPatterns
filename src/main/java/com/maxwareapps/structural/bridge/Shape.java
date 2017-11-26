package com.maxwareapps.structural.bridge;

public abstract class Shape {
    //Composition - implementor
    protected CircleRenderer renderer;

    public Shape(CircleRenderer renderer) {
        this.renderer = renderer;
    }

    public abstract String draw();
}
