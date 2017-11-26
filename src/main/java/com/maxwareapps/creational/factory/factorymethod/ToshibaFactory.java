package com.maxwareapps.creational.factory.factorymethod;

/**
 * Subclass decides which classes to instantiate (Toshiba).
 */
public class ToshibaFactory implements ITVFactory {
    private static ToshibaFactory INSTANCE= null;

    private ToshibaFactory() {
    }

    public static  ToshibaFactory getFactory(){
        if (INSTANCE == null){
            INSTANCE = new ToshibaFactory();
        }
        return INSTANCE;
    }

    @Override
    public ITV createTV() {
        return new Toshiba();
    }
}
