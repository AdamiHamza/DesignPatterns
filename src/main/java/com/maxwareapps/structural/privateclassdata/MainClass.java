package com.maxwareapps.structural.privateclassdata;

public class MainClass {
    private DataClass dataClass;

    public MainClass(String attributeOne, int attributeTwo) {
        dataClass = new DataClass(attributeOne,attributeTwo);
    }

    @Override
    public String toString() {
        return dataClass.getAttributeOne()+"::"+dataClass.getAttributeTwo();
    }
}
