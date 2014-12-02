package com.java.patterns.src.strategy;

public class Context {
    private final Strategy strategy;

    public Context(final Strategy addition) {
        this.strategy = addition;
    }

    public int executeStrategy(final int first, final int second) {
        return strategy.executeStrategy(first, second);
    }
}
