package com.maxwareapps.behavioral.visitor;

public interface Visitable {
    void accept(Visitor visitor);
}
