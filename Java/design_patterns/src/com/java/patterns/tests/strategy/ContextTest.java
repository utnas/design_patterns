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

}
