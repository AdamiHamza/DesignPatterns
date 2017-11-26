package com.maxwareapps.creational.factory.abstractfactory;


public class SonyLCD implements ISony {
    @Override
    public void powerOn() {
        System.out.println("Sony, make.believe");
    }
}
