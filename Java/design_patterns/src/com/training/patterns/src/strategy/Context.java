package com.training.patterns.src.strategy;

public class Context {
    private final Strategy strategy;

    public Context(final Strategy strategy) {
        this.strategy = strategy;
    }

    public float applyStrategy() {
        return strategy.execute();
    }
}
