package com.java.architecture.src.mvp;

public class Calculator {
    private float defaultValue;

    public Calculator() {
        this.defaultValue = 0;
    }

    public float getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(float defaultValue) {
        this.defaultValue = defaultValue;
    }

    public void add(float inPut) {
        defaultValue = defaultValue + inPut;
    }

    public void multiply(float input) {
        defaultValue = defaultValue * input;
    }

    public void divide(float input) {
        defaultValue = defaultValue / input;
    }

    public void clear() {
        defaultValue = 0;
    }
}
