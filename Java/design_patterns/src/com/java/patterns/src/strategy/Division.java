package com.java.patterns.src.strategy;

public class Division implements Strategy {
    private float first;
    private float second;

    public Division(float first, float second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public float execute() {
        return first / second;
    }
}
