package com.java.patterns.src.decorator;

public class MusicFactory {
    public static MusicSample make(final String melody, final int tempo) {
        return new MusicSample(melody, tempo);
    }
}
