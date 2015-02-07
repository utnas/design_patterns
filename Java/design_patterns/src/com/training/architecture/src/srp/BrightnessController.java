package com.training.architecture.src.srp;

public final class BrightnessController implements Editor {

    @Override
    public Image increase(final Image image, final int value) {
        return new Image(image.getPath(), image.getDirection(), image.getBrightness() + value);
    }

    @Override
    public Image decrease(Image image, int value) {
        return new Image(image.getPath(), image.getDirection(), image.getBrightness() - value);
    }
}
