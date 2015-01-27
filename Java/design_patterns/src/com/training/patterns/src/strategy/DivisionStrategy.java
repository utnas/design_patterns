package com.training.patterns.src.strategy;

public class DivisionStrategy implements Strategy {
    private float first;
    private float second;

    public DivisionStrategy(float first, float second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public float execute() {
        return first / second;
    }
}
