package com.maxwareapps.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Visitable> items = new ArrayList<Visitable>();

    public double calculatePostage(){
        PostageVisitor postageVisitor = new PostageVisitor();
        for (Visitable v : items){
            v.accept(postageVisitor);
        }
        return postageVisitor.getTotalPostage();
    }

    public void addItem(Visitable visitable){
        items.add(visitable);
    }
}
