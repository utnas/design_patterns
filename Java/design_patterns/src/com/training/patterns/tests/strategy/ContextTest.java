package com.training.patterns.tests.strategy;

import com.training.patterns.src.strategy.AdditionStrategy;
import com.training.patterns.src.strategy.Context;
import com.training.patterns.src.strategy.DivisionStrategy;
import com.training.patterns.src.strategy.MultiplicationStrategy;
import org.junit.Test;

import static java.lang.Float.POSITIVE_INFINITY;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ContextTest {

    @Test
    public void contextAddition() {
        final Context context = new Context(new AdditionStrategy(2F, 3F));
        assertThat(context.executeStrategy(), is(5F));
    }

    @Test
    public void contextAdditionShouldReturnZero() {
        final Context context = new Context(new AdditionStrategy(0F, 0F));
        assertThat(context.executeStrategy(), is(0F));
    }

    @Test
    public void contextSubtractionShouldReturn2() {
        final Context context = new Context(new AdditionStrategy(5F, -3F));
        assertThat(context.executeStrategy(), is(2F));
    }

    @Test
    public void contextSubtractionShouldReturnMinus2() {
        final Context context = new Context(new AdditionStrategy(3, -5));
        assertThat(context.executeStrategy(), is(-2F));
    }

    @Test
    public void contextDivisionShouldReturn2() {
        final Context context = new Context(new DivisionStrategy(4F, 2F));
        assertThat(context.executeStrategy(), is(2F));
    }

    @Test
    public void contextSubtractionShouldReturnInfinity() {
        final Context context = new Context(new DivisionStrategy(23, 0));
        assertThat(context.executeStrategy(), is(POSITIVE_INFINITY));
    }

    @Test
    public void contextMultiplicationShouldReturn15() {
        final Context context = new Context(new MultiplicationStrategy(3F, 5F));
        assertThat(context.executeStrategy(), is(15F));
    }
}
