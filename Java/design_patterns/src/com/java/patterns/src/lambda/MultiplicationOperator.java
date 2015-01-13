package com.java.patterns.src.lambda;

public class MultiplicationOperator implements Operation<Float> {
    @Override
    public Float compute(final Float... values) {
        float result = 1;
        for (final Float value : values) {
            result = result * value;
        }
        return result;
    }
}
