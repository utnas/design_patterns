package com.java.patterns.src.strategy;

public class Context {
    private final Strategy strategy;

    public Context(final Strategy addition) {
        this.strategy = addition;
    }

    public int executeStrategy(final int first, final int second) {
        try {
            return strategy.executeStrategy(first, second);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
