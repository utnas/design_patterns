package com.java.patterns.src.lambda;

public interface Operation<T> {
    public T compute(final T... values);
}