package com.java.patterns.tests.strategy;

import com.java.patterns.src.strategy.Addition;
import com.java.patterns.src.strategy.Context;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ContextTest {

    @Test
    public void contextAddition() {
        final Context context = new Context(new Addition());
        assertThat(context.executeStrategy(2, 3), is(5));
    }

    @Test
    public void contextAdditionShouldReturnZero() {
        final Context context = new Context(new Addition());
        assertThat(context.executeStrategy(0, 0), is(0));
    }

    @Test
    public void contextSubtractionShouldReturn2() {
        final Context context = new Context(new Subtraction());
        assertThat(context.executeStrategy(5, 3), is(2));
    }

    @Test
    public void contextSubtractionShouldReturnMinus2() {
        final Context context = new Context(new Subtraction());
        assertThat(context.executeStrategy(3, 5), is(-2));
    }
}
