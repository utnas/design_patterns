package com.training.architecture.src.clean_code.srp.rotation.controller;

import com.training.architecture.src.clean_code.srp.Image;
import com.training.architecture.src.clean_code.srp.rotation.strategy.Strategy;

public final class RotationController {
    private Strategy<Image> strategy;

    public RotationController(final Strategy<Image> strategy) {
        this.strategy = strategy;
    }

    public final Image applyRotation() {
        return strategy.apply();
    }
}
