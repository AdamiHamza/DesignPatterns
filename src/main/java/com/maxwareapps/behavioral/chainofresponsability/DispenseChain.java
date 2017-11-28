package com.maxwareapps.behavioral.chainofresponsability;

/**
 * Avoid coupling the sender of a request "ATM Client" to its receiver "ATM" by giving more than one object "Dispensers" a chance to handle the request.
 * Chain the receiving objects and pass the request along the chain until an object handles it.
 *
 * NOTE: Do not use Chain of Responsibility when each request is only handled by one handler,
 *       or, when the client object knows which service object should handle the request.
 *
 */
public interface DispenseChain {
    void addChain(DispenseChain nxtChain);
    void dispense(Currency currency);
}
