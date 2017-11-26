package com.maxwareapps.behavioral.visitor;

public interface Visitor {
    void visit(Book book);
    void visit(Mobile mobile);
}
