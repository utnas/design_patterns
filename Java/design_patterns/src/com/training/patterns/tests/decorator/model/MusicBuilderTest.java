package com.training.patterns.tests.decorator.model;

import com.training.patterns.src.decorator.model.MusicBuilder;
import com.training.patterns.src.decorator.model.MusicSample;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MusicBuilderTest {

    @Test
    public void testMakeMusic() {
        final MusicSample music = MusicBuilder.make("Hey yo !!!", 23);
        assertThat(music.getTempo(), is(23));
        assertThat(music.getMelody(), is("Hey yo !!!"));
    }
}
