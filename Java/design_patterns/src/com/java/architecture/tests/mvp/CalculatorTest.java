package com.java.architecture.tests.mvp;


import com.java.architecture.src.mvp.Calculator;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void defaultValueShouldBeZero() {
        final Calculator calculator = new Calculator();
        assertThat(calculator.getDefaultValue(), is(0F));
    }

    @Test
    public void setValueTest() {
        final Calculator calculator = new Calculator();
        calculator.setDefaultValue(2);
        assertThat(calculator.getDefaultValue(), is(2F));
    }

    @Test
    public void itShouldAddValue() {
        final Calculator calculator = new Calculator();
        calculator.add(3);
        assertThat(calculator.getDefaultValue(), is(3F));
    }

    @Test
    public void itShouldSubtractValue() {
        final Calculator calculator = new Calculator();
        calculator.add(2);
        calculator.add(-2);
        assertThat(calculator.getDefaultValue(), is(0F));
    }

    @Test
    public void itShouldMultiplyValueByZero() {
        final Calculator calculator = new Calculator();
        calculator.multiply(2);
        assertThat(calculator.getDefaultValue(), is(0F));
    }

    @Test
    public void itShouldMultiplyValueByOne() {
        final Calculator calculator = new Calculator();
        calculator.add(1);
        calculator.multiply(2);
        assertThat(calculator.getDefaultValue(), is(2F));
    }

    @Test
    public void itShouldMultiplyValue() {
        final Calculator calculator = new Calculator();
        calculator.add(2);
        calculator.multiply(2);
        assertThat(calculator.getDefaultValue(), is(4F));
    }

    @Test
    public void itShouldDivideZeroByZero() {
        final Calculator calculator = new Calculator();
        calculator.divide(0);
        assertThat(calculator.getDefaultValue(), is(Float.NaN));
    }

    @Test
    public void itShouldDividePositiveFloatByZero() {
        final Calculator calculator = new Calculator();
        calculator.add(1);
        calculator.divide(0);
        assertThat(calculator.getDefaultValue(), is(Float.POSITIVE_INFINITY));
    }

    @Test
    public void itShouldDivideNegativeFloatByZero() {
        final Calculator calculator = new Calculator();
        calculator.add(-1);
        calculator.divide(0);
        assertThat(calculator.getDefaultValue(), is(Float.NEGATIVE_INFINITY));
    }

    @Test
    public void itShouldDivideFloatByOtherFloat() {
        final Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.divide(9);
        assertThat(calculator.getDefaultValue(), is(0.5555556F));
    }

    @Test
    public void itShouldClearValue() {
        final Calculator calculator = new Calculator();
        calculator.add(10);
        calculator.divide(5);
        assertThat(calculator.getDefaultValue(), is(2F));
        calculator.clear();
        assertThat(calculator.getDefaultValue(), is(0F));
    }
}
