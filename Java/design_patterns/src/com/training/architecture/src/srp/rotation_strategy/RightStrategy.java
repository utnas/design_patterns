package com.training.architecture.src.srp.rotation_strategy;


import com.training.architecture.src.srp.Image;

public final class RightStrategy implements Strategy {
    private final Image image;

    public RightStrategy(final Image image) {
        this.image = image;
    }

    @Override
    public final Image apply() {
        return new Image(image.getPath(), "Right", image.getBrightness());
    }
}