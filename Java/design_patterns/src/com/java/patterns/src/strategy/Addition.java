package com.java.patterns.src.strategy;

public class Addition implements Strategy {
    private float first;
    private float second;

    public Addition(float first, float second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public float executeStrategy() {
        return first + second;
    }
}
