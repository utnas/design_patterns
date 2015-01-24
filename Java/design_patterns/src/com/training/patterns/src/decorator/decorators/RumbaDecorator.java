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
    public MusicSample harmonize() {
        music = make(music.getMelody(), (this.tempo + music.getTempo()) / 2);
        return music;
    }

    @Override
    public int getTempo() {
        return tempo;
    }
}

class Moi {
    void func() {

    }
}

class moioi extends Moi {

}