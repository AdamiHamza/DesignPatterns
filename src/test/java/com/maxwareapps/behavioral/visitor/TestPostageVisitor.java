package com.maxwareapps.behavioral.visitor;


import com.maxwareapps.behavioral.visitor.Book;
import com.maxwareapps.behavioral.visitor.Mobile;
import com.maxwareapps.behavioral.visitor.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Visitor Design Pattern (Postage Visitor).
 */
public class TestPostageVisitor {
    @Test
    public void testCalculatePostage(){
        ShoppingCart shoppingCart = new ShoppingCart();
        Book book = new Book("The Lord Of The Rings",9.99,250);
        shoppingCart.addItem(book);
        Mobile mobile = new Mobile("Nokia",9.99,250);
        shoppingCart.addItem(mobile);
        Assert.assertEquals(1750.0,shoppingCart.calculatePostage(),0.0);
    }
}
