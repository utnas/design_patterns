package com.training.architecture.src.srp.rotation_strategy;

import com.training.architecture.src.srp.Image;

public final class LeftStrategy implements Strategy {
    private final Image image;

    public LeftStrategy(final Image image) {
        this.image = image;
    }

    @Override
    public final Image apply() {
        return new Image(image.getPath(), "Left", image.getBrightness());
    }
}
