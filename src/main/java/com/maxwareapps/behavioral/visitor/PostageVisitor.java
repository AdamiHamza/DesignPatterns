package com.maxwareapps.behavioral.visitor;

public class PostageVisitor implements Visitor {
    private double totalPostageForCart;
    @Override
    public void visit(Book book) {
        if(book.getPrice() < 10.0) {
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    @Override
    public void visit(Mobile mobile) {
        if(mobile.getPrice() < 10.0) {
            totalPostageForCart += mobile.getWeight() * 5;
        }
    }


    //return the internal state
    public double getTotalPostage() {
        return totalPostageForCart;
    }
}
