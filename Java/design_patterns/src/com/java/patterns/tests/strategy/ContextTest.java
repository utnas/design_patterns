package com.java.patterns.tests.strategy;

import com.java.patterns.src.strategy.Addition;
import com.java.patterns.src.strategy.Context;
import com.java.patterns.src.strategy.Division;
import com.java.patterns.src.strategy.Multiplication;
import org.junit.Test;

import static java.lang.Float.POSITIVE_INFINITY;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ContextTest {

    @Test
    public void contextAddition() {
        final Context context = new Context(new Addition(2F, 3F));
        assertThat(context.executeStrategy(), is(5F));
    }

    @Test
    public void contextAdditionShouldReturnZero() {
        final Context context = new Context(new Addition(0F, 0F));
        assertThat(context.executeStrategy(), is(0F));
    }

    @Test
    public void contextSubtractionShouldReturn2() {
        final Context context = new Context(new Addition(5F, -3F));
        assertThat(context.executeStrategy(), is(2F));
    }

    @Test
    public void contextSubtractionShouldReturnMinus2() {
        final Context context = new Context(new Addition(3, -5));
        assertThat(context.executeStrategy(), is(-2F));
    }

    @Test
    public void contextDivisionShouldReturn2() {
        final Context context = new Context(new Division(4F, 2F));
        assertThat(context.executeStrategy(), is(2F));
    }

    @Test
    public void contextSubtractionShouldReturnInfinity() {
        final Context context = new Context(new Division(23, 0));
        assertThat(context.executeStrategy(), is(POSITIVE_INFINITY));
    }

    @Test
    public void contextMultiplicationShouldReturn15() {
        final Context context = new Context(new Multiplication(3F, 5F));
        assertThat(context.executeStrategy(), is(15F));
    }
}
