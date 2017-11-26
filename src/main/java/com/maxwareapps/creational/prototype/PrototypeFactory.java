package com.maxwareapps.creational.prototype;

import java.util.HashMap;

/**
 * Prototype Factory
 *
 * The Factory knows how to find the correct Prototype.
 *
 */
public class PrototypeFactory implements IPrototypeFactory {
    private static PrototypeFactory INSTANCE = null;

    //maintains a dictionary of all "cloneable" concrete derived classes
    private HashMap<String,PrototypeCapable> shapesPrototypes = new HashMap<String, PrototypeCapable>();

    private PrototypeFactory() {
    }

    public static PrototypeFactory getFactory(){
        if (INSTANCE == null){
            INSTANCE = new PrototypeFactory();
        }
        return INSTANCE;
    }


    /**
     *  Register a prototypical instance
     *
     * @param type type of prototype
     * @param prototype the prototype to cache.
     */
    public void register(String type, PrototypeCapable prototype){
        shapesPrototypes.put(type,prototype);
    }

    /**
     *
     * @param shapeType specify the prototype key.
     * @return A prototype of type shapeType.
     * @throws CloneNotSupportedException Throw an exception if shape does not support cloning
     */
    public PrototypeCapable getShape(String shapeType) throws CloneNotSupportedException{
        PrototypeCapable shape = shapesPrototypes.get(shapeType);
        if (shape != null) shape = shape.clone();
        return shape;
    }




}
