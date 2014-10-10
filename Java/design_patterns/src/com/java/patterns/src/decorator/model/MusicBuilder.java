package com.java.patterns.src.decorator.model;

public class MusicBuilder {
    public static MusicSample make(final String melody, final int tempo) {
        return new MusicSample(melody, tempo);
    }
}
