package com.java.patterns.src.decorator;

public class RumbaDecorator implements Music {
    private MusicSample music;
    private int tempo = 140;

    public RumbaDecorator(final MusicSample musicSample) {
        this.music = musicSample;
    }

    @Override
    public Music harmonize() {
        music = MusicFactory.make(music.getMelody(), (this.tempo + music.getTempo()) / 2);
        return music;
    }

    @Override
    public int getTempo() {
        return tempo;
    }
}
