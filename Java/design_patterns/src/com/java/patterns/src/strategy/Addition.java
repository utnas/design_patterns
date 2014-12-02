package com.java.patterns.src.strategy;

public class Addition implements Strategy {
    @Override
    public int executeStrategy(int first, int second) {
        return (first + second);
    }
}
