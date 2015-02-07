package com.training.architecture.src.clean_code.srp.rotation.strategy;

import com.training.architecture.src.clean_code.srp.Image;

public final class LeftRotationStrategy implements Strategy<Image> {
    private final Image image;

    public LeftRotationStrategy(final Image image) {
        this.image = image;
    }

    @Override
    public final Image apply() {
        return new Image(image.getPath(), "Left", image.getBrightness());
    }
}
