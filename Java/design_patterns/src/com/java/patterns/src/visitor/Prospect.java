package com.java.patterns.src.visitor;

public class Prospect implements Guest {

    private String name;

    public Prospect(final String name) {
        this.name = name;
    }

    @Override
    public void accept(Sales sales) {
        sales.visit(this);
    }

    public String getName() {
        return name;
    }
}
