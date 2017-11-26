package com.maxwareapps.structural.proxy;

public class AccountFunds implements Payment {
    private double balance;

    public AccountFunds(double balance) {
        this.balance = balance;
    }

    public double withdrawal(double amount) {
        if (balance >= amount){
            balance = balance - amount;
            return amount;
        }
        return 0;
    }
}
