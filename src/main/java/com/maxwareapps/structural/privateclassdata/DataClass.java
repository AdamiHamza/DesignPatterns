package com.maxwareapps.structural.privateclassdata;

public class DataClass {
    private String attributeOne;
    private int attributeTwo;


    public DataClass(String attributeOne, int attributeTwo) {
        this.attributeOne = attributeOne;
        this.attributeTwo = attributeTwo;
    }

    public String getAttributeOne() {
        return attributeOne;
    }

    public int getAttributeTwo() {
        return attributeTwo;
    }
}
