package com.maxwareapps.behavioral.chainofresponsability;

public class USD50Dispenser implements DispenseChain{

    private DispenseChain nextInChain;

    @Override
    public void addChain(DispenseChain nxtChain) {
        this.nextInChain = nxtChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 50){
            int number = currency.getAmount()/50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing "+number+" 50 USD");
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
            System.out.println("No 50 Dollars to dispense delegating to next Chain");
            this.nextInChain.dispense(currency);
        }
    }
}
