package com.java.patterns.src.decorator.decorators;

import com.java.patterns.src.decorator.model.MusicBuilder;
import com.java.patterns.src.decorator.model.MusicSample;

public class RumbaDecorator implements MusicDecorator {
    private MusicSample music;
    private int tempo = 140;

    public RumbaDecorator(final MusicSample musicSample) {
        this.music = musicSample;
    }

    @Override
    public MusicSample harmonize() {
        music = MusicBuilder.make(music.getMelody(), (this.tempo + music.getTempo()) / 2);
        return music;
    }

    @Override
    public int getTempo() {
        return tempo;
    }
}
