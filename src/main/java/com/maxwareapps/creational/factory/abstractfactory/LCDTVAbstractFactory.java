package com.maxwareapps.creational.factory.abstractfactory;

public class LCDTVAbstractFactory implements ITVAbstractFactory{
    private static LCDTVAbstractFactory INSTANCE = null;

    private LCDTVAbstractFactory(){

    }

    public static LCDTVAbstractFactory getFactory(){
        if (INSTANCE == null){
            INSTANCE= new LCDTVAbstractFactory();
        }
        return INSTANCE;
    }

    @Override
    public ITV createSonyTV() {
        return new SonyLCD();
    }

    @Override
    public ITV createSamsungTV() {
        return new SamsungLCD();
    }
}
