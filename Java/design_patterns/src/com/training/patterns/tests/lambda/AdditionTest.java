package com.training.patterns.tests.lambda;


import com.training.patterns.src.lambda.AdditionOperator;
import com.training.patterns.src.lambda.Operation;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AdditionTest {

    @Test
    public void additionShouldAddTwoValues() {
        final Operation<Float> additionOperation = new AdditionOperator();
        assertThat(additionOperation.compute(3F, 4F, 2F, 0F, 1F, 5F), is(15F));
    }

    @Test
    public void additionShouldAddTwoNegativeValues() {
        final Operation<Float> additionOperation = new AdditionOperator();
        assertThat(additionOperation.compute(-3F, 4F), is(1F));
    }
}
