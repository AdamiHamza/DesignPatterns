package com.maxwareapps.behavioral.observer;

public class Bidder extends Observer {

    public Bidder(Subject subject) {
        super(subject);
        this.subject.attach(this);
    }

    @Override
    public void execute(int newState) {
        callBid(newState);
    }

    private void callBid(int amount){
        if (amount < subject.getState()) throw new IllegalArgumentException("Bid amount not acceptable, bellow current amount.");
        else subject.setState(amount);
    }

    @Override
    public void update() {
        System.out.println("New bid, Current Bid : " + subject.getState());
    }
}
