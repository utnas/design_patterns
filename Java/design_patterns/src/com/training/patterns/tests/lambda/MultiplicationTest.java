package com.training.patterns.tests.lambda;

import com.training.patterns.src.lambda.MultiplicationOperator;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiplicationTest {

    @Test
    public void shouldMultiplyNumbers() {
        assertThat(new MultiplicationOperator().compute((float) 2, (float) 2.3, (float) 1.4), is(6.4399996F));
    }

    @Test
    public void shouldReturnZero() {
        assertThat(new MultiplicationOperator().compute((float) 2, (float) 33, (float) 44, (float) 0), is(0F));
    }
}
