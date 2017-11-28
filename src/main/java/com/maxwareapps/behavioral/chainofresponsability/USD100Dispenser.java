package com.maxwareapps.behavioral.chainofresponsability;

public class USD100Dispenser implements DispenseChain{

    private DispenseChain nextInChain;

    @Override
    public void addChain(DispenseChain nxtChain) {
        this.nextInChain = nxtChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() % 10 != 0){
            System.out.println("Amount must be a multiple of 10");
            return;
        }
        if (currency.getAmount() >= 100){
            int number = currency.getAmount()/100;
            int remainder = currency.getAmount() % 100;
            System.out.println("Dispensing "+number+" 100 USD");
            if(remainder != 0) {
                currency.setAmount(remainder);
                this.nextInChain.dispense(currency);
            }
            else {
                System.out.println("============FINISH============");
                currency.setAmount(0); //Finish
            }
        }
        else {
            System.out.println("No 100 Dollars to dispense delegating to next Chain");
            this.nextInChain.dispense(currency);
        }
    }
}
