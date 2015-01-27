package com.training.patterns.src.strategy;

public class AdditionStrategy implements Strategy {
    private float first;
    private float second;

    public AdditionStrategy(float first, float second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public float execute() {
        return first + second;
    }
}
