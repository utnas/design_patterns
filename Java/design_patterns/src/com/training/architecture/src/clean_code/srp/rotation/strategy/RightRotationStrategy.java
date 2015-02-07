package com.training.architecture.src.clean_code.srp.rotation.strategy;


import com.training.architecture.src.clean_code.srp.Image;

public final class RightRotationStrategy implements Strategy<Image> {
    private final Image image;

    public RightRotationStrategy(final Image image) {
        this.image = image;
    }

    @Override
    public final Image apply() {
        return new Image(image.getPath(), "Right", image.getBrightness());
    }
}