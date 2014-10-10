package com.java.patterns.tests.decorator;


import com.java.patterns.src.decorator.decorators.RumbaDecorator;
import com.java.patterns.src.decorator.decorators.SalsaDecorator;
import com.java.patterns.src.decorator.model.MusicSample;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DecoratorTest {

    @Test
    public void testSalsaDecorator() {
        final MusicSample sample = new MusicSample("Melody");
        final SalsaDecorator salsaDecorator = new SalsaDecorator(sample);

        assertThat(salsaDecorator.harmonize().getTempo(), is(110));
    }

    @Test
    public void testRumbaDecorator() {
        final MusicSample sample = new MusicSample("Melody");
        final RumbaDecorator rumbaDecorator = new RumbaDecorator(sample);

        assertThat(rumbaDecorator.harmonize().getTempo(), is(70));
    }

    @Test
    public void testRumbaThenSalsaHarmonization() {
        MusicSample sample = new MusicSample("Melody");
        sample = new RumbaDecorator(sample).harmonize();
        sample = new SalsaDecorator(sample).harmonize();

        assertThat(sample.getTempo(), is(145));
    }

    @Test
    public void testSalsaThenRumbaHarmonization() {
        MusicSample sample = new MusicSample("Melody");
        sample = new SalsaDecorator(sample).harmonize();
        sample = new RumbaDecorator(sample).harmonize();

        assertThat(sample.getTempo(), is(125));
    }
}
