package com.training.architecture.src.srp.rotation.controller;

import com.training.architecture.src.srp.Image;
import com.training.architecture.src.srp.rotation.strategy.Strategy;

public final class RotationController {
    private Strategy<Image> strategy;

    public RotationController(final Strategy<Image> strategy) {
        this.strategy = strategy;
    }

    public final Image applyRotation() {
        return strategy.apply();
    }
}
