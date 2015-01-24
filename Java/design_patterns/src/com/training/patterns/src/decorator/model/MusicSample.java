package com.training.patterns.src.decorator.model;

public final class MusicSample implements Music {
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

    @Override
    public final int getTempo() {
        return tempo;
    }

    public final String getMelody() {
        return melody;
    }
}
