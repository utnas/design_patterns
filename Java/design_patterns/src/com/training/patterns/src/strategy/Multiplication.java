package com.training.patterns.src.strategy;

public class Multiplication implements Strategy {
    private final float first;
    private final float second;

    public Multiplication(final float first, final float second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public float execute() {
        return first * second;
    }
}
