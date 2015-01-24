package com.training.patterns.src.decorator.decorators;

import com.training.patterns.src.decorator.model.Music;
import com.training.patterns.src.decorator.model.MusicSample;

public interface MusicDecorator extends Music {
    public MusicSample harmonize();

    public int getTempo();
}
