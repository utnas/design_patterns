package com.java.patterns.src.decorator.decorators;

import com.java.patterns.src.decorator.model.Music;
import com.java.patterns.src.decorator.model.MusicFactory;
import com.java.patterns.src.decorator.model.MusicSample;

public class SalsaDecorator implements MusicDecorator {
    private final MusicSample music;
    private int tempo = 220;

    public SalsaDecorator(final MusicSample musicSample) {
        music = musicSample;
    }

    public MusicSample harmonize() {
        return MusicFactory.make(music.getMelody(), (this.tempo + music.getTempo()) / 2);
    }

    public int getTempo() {
        return tempo;
    }
}
