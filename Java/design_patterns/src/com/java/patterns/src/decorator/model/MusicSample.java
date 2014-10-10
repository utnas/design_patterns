package com.java.patterns.src.decorator.model;

public class MusicSample implements Music {
    private final String melody;
    private final int tempo;

    public MusicSample(final String melody) {
        this.melody = melody;
        tempo = 0;
    }

    public MusicSample(final String melody, final int tempo) {
        this.melody = melody;
        this.tempo = tempo;
    }

    public int getTempo() {
        return tempo;
    }

    public Music harmonize() {
        return MusicFactory.make(melody, tempo);
    }

    public String getMelody() {
        return melody;
    }
}
