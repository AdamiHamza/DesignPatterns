package com.maxwareapps.structural.decorator;

public abstract class InsuranceDecorator implements Insurance {
    protected Insurance insurance;

    public InsuranceDecorator(Insurance insurance) {
        this.insurance = insurance;
    }
}
