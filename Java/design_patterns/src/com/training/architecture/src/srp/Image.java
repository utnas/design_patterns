package com.training.architecture.src.srp;

public final class Image {
    private final String path;
    private final String direction;
    private final int brightness;

    public Image(final String path, final String direction, final int brightness) {
        this.path = path;
        this.direction = direction;
        this.brightness = brightness;
    }

    public final String getPath() {
        return path;
    }

    public final String getDirection() {
        return direction;
    }

    public final int getBrightness() {
        return brightness;
    }
}
