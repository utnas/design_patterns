package com.java.patterns.src.lambda;

public class AdditionOperator implements Operation<Float> {

    @Override
    public Float compute(final Float... values) {
        float result = 0;
        for (final Float value : values) {
            result = result + value;
        }
        return result;
    }
}