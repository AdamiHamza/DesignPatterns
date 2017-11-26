package com.maxwareapps.structural.proxy;

public class CheckProxy implements Payment {
    private AccountFunds accountFunds;

    public CheckProxy(double balance) {
        accountFunds =  new AccountFunds(balance);
    }

    @Override
    public double withdrawal(double amount) {
        if (accountFunds == null){
            accountFunds = new AccountFunds(0);
        }
        return accountFunds.withdrawal(amount);
    }
}
