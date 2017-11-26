package com.maxwareapps.structural.decorator;

public class BaseInsurance implements Insurance{
    private String description;
    private double cost;

    public BaseInsurance(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
}
