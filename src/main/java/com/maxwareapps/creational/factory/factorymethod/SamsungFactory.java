package com.maxwareapps.creational.factory.factorymethod;

/**
 * Subclass decides which classes to instantiate (Samsung).
 */
public class SamsungFactory implements ITVFactory {
    private static SamsungFactory INSTANCE= null;

    private SamsungFactory() {
    }

    public static  SamsungFactory getFactory(){
        if (INSTANCE == null){
            INSTANCE = new SamsungFactory();
        }
        return INSTANCE;
    }

    @Override
    public ITV createTV() {
        return new Samsung();
    }
}
