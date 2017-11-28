package com.maxwareapps.behavioral.chainofresponsability;

public class USD20Dispenser implements DispenseChain{

    private DispenseChain nextInChain;

    @Override
    public void addChain(DispenseChain nxtChain) {
        this.nextInChain = nxtChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 20){
            int number = currency.getAmount()/20;
            int remainder = currency.getAmount() % 20;
            System.out.println("Dispensing "+number+" 20 USD");
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
            System.out.println("No 20 Dollars to dispense delegating to next Chain");
             this.nextInChain.dispense(currency);
        }
    }
}
