package com.java.patterns.src.decorator.decorators;

import com.java.patterns.src.decorator.model.Music;
import com.java.patterns.src.decorator.model.MusicSample;

public interface MusicDecorator extends Music {
    public MusicSample harmonize();

    public int getTempo();
}
