package com.maxwareapps.structural.proxy;

public class TestProxy {
    public static void main(String[] args) {
        Payment payment = new CheckProxy(10000);
        System.out.println("Withdrawal of : " + payment.withdrawal(1000) + " USD");
        System.out.println("Withdrawal of : " + payment.withdrawal(1000) + " USD");
        System.out.println("Withdrawal of : " + payment.withdrawal(9000) + " USD");
    }
}
