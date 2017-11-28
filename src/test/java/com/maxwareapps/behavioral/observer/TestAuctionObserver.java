package com.maxwareapps.behavioral.observer;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for Observer Design Pattern (Auction Observer).
 */
public class TestAuctionObserver {

    private static Observer[] observers = new Observer[3];

    @BeforeClass
    public static void init(){
        Subject auctioneer = new Auctioneer();
        auctioneer.setState(120);
        observers[0] = new Bidder(auctioneer);
        observers[1] = new Bidder(auctioneer);
        observers[2] = new Bidder(auctioneer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAmountBellowCurrentBid(){
        observers[1].execute(112);
    }

    @Test
    public void testAmountGreaterFromCurrentBid() throws Exception{
        observers[1].execute(130);
    }
}
