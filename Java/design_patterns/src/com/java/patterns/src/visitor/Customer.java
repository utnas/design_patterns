package com.java.patterns.src.visitor;

public class Customer implements Guest {
    @Override
    public void accept(Sales sales) {
        sales.visit(this);
    }
}
