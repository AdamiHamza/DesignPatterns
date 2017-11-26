package com.maxwareapps.creational.factory.factorymethod;

/**
 * Subclass decides which classes to instantiate (Sony).
 */
public class SonyFactory implements ITVFactory{
    private static SonyFactory INSTANCE= null;

    private SonyFactory() {
    }

    public static  SonyFactory getFactory(){
        if (INSTANCE == null){
            INSTANCE = new SonyFactory();
        }
        return INSTANCE;
    }

    @Override
    public ITV createTV() {
        return new Sony();
    }
}
