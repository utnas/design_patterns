package com.java.patterns.src.decorator.decorators;

import com.java.patterns.src.decorator.model.MusicSample;

import static com.java.patterns.src.decorator.model.MusicBuilder.make;

public class SalsaDecorator implements MusicDecorator {
    private final MusicSample music;
    private int tempo = 220;

    public SalsaDecorator(final MusicSample musicSample) {
        music = musicSample;
    }

    @Override
    public MusicSample harmonize() {
        return make(music.getMelody(), (this.tempo + music.getTempo()) / 2);
    }

    @Override
    public int getTempo() {
        return tempo;
    }
}
