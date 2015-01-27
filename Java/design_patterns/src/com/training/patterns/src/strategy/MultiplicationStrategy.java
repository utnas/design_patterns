package com.training.patterns.src.strategy;

public class MultiplicationStrategy implements Strategy {
    private final float first;
    private final float second;

    public MultiplicationStrategy(final float first, final float second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public float execute() {
        return first * second;
    }
}
