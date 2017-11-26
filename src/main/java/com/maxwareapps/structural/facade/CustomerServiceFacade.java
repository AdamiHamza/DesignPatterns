package com.maxwareapps.structural.facade;

public class CustomerServiceFacade {
    private Shipping shipping;
    private Billing billing;
    private OrderFullfillment orderFullfillment;

    public CustomerServiceFacade() {
        this.shipping = new Shipping();
        this.billing = new Billing();
        this.orderFullfillment = new OrderFullfillment();
    }

    public String shipOrder(){
        return shipping.Ship();
    }

    public String fullFillOrder(){
        return orderFullfillment.fullFill();
    }

    public String billOrder(){
        return billing.bill();
    }
}
