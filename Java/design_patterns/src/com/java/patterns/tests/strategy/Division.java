package com.java.patterns.tests.strategy;

import com.java.patterns.src.strategy.Strategy;

public class Division implements Strategy {
    @Override
    public int executeStrategy(int first, int second) throws Exception {
        if (second != 0) {
            return first / second;
        }
        throw new Exception("Division impossible");
    }
}
