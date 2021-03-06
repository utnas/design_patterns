package com.training.architecture.src.clean_code.srp.editor;

import com.training.architecture.src.clean_code.srp.Image;

public final class BrightnessController implements Editor<Image> {

    @Override
    public Image increase(final Image image, final int value) {
        return new Image(image.getPath(), image.getDirection(), image.getBrightness() + value);
    }

    @Override
    public Image decrease(final Image image, final int value) {
        return new Image(image.getPath(), image.getDirection(), image.getBrightness() - value);
    }
}