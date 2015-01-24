package com.training.patterns.src.decorator.decorators;

import com.training.patterns.src.decorator.model.MusicSample;

import static com.training.patterns.src.decorator.model.MusicBuilder.make;

public class RumbaDecorator implements MusicDecorator {
    private MusicSample music;
    private int tempo = 140;

    public RumbaDecorator(final MusicSample musicSample) {
        this.music = musicSample;
    }

    @Override
    public final MusicSample harmonize() {
        return make(music.getMelody(), (this.tempo + music.getTempo()) / 2);
    }

    @Override
    public final int getTempo() {
        return tempo;
    }
}