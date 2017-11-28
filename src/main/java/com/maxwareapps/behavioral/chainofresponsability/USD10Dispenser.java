package com.maxwareapps.behavioral.chainofresponsability;

public class USD10Dispenser implements DispenseChain{

    private DispenseChain nextInChain;

    @Override
    public void addChain(DispenseChain nxtChain) {
        this.nextInChain = nxtChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 10){
            int number = currency.getAmount()/10;
            int remainder = currency.getAmount() % 10;
            System.out.println("Dispensing "+number+" 10 USD ");
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
            System.out.println("No 10 Dollars to dispense delegating to next Chain");
            this.nextInChain.dispense(currency);
        }
    }
}
