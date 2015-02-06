package com.training.architecture.src.srp.rotation_strategy;


import com.training.architecture.src.srp.Image;

public class RotatorContext {

    private Strategy<Image> strategy;

    public RotatorContext(final Strategy<Image> strategy) {
        this.strategy = strategy;
    }

    public Image applyRotation() {
        return strategy.apply();
    }
}
