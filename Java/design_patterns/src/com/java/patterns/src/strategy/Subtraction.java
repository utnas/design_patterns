package com.java.patterns.src.strategy;

import com.java.patterns.src.strategy.Strategy;

public class Subtraction implements Strategy {
    @Override
    public int executeStrategy(int first, int second) {
        return first - second;
    }
}
