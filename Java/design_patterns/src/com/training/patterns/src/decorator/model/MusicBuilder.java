package com.training.patterns.src.decorator.model;

public final class MusicBuilder {
    public static MusicSample make(final String melody, final int tempo) {
        return new MusicSample(melody, tempo);
    }
}
