package com.maxwareapps.creational.factory.abstractfactory;

public class LEDTVAbstractFactory implements ITVAbstractFactory{
    private static LEDTVAbstractFactory INSTANCE = null;

    private LEDTVAbstractFactory(){

    }

    public static LEDTVAbstractFactory getFactory(){
        if (INSTANCE == null){
            INSTANCE= new LEDTVAbstractFactory();
        }
        return INSTANCE;
    }

    @Override
    public ITV createSonyTV() {
        return new SonyLED();
    }

    @Override
    public ITV createSamsungTV() {
        return new SamsungLED();
    }
}
