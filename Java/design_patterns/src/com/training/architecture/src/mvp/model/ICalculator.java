package com.training.architecture.src.mvp.model;

public interface ICalculator {
    public float getDefaultValue();

    public void setDefaultValue(float defaultValue);

    public void add(float inPut);

    public void multiply(float input);

    public void divide(float input);

    public void clear();
}
