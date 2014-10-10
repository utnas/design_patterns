package com.java.patterns.src.decorator;

public class SalsaDecorator implements Music {
    private final MusicSample music;
    private int tempo = 220;

    public SalsaDecorator(final MusicSample musicSample) {
        music = musicSample;
    }

    public Music harmonize() {
        return MusicFactory.make(music.getMelody(), (this.tempo + music.getTempo()) / 2);
    }

    public int getTempo() {
        return tempo;
    }
}
