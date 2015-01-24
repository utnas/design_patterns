package com.training.architecture.tests.mvp.model;


import com.training.architecture.src.mvp.model.CalculatorModel;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorModelTest {

    @Test
    public void defaultValueShouldBeZero() {
        final CalculatorModel calculatorModel = new CalculatorModel();
        assertThat(calculatorModel.getDefaultValue(), is(0F));
    }

    @Test
    public void setValueTest() {
        final CalculatorModel calculatorModel = new CalculatorModel();
        calculatorModel.setDefaultValue(2);
        assertThat(calculatorModel.getDefaultValue(), is(2F));
    }

    @Test
    public void itShouldAddValue() {
        final CalculatorModel calculatorModel = new CalculatorModel();
        calculatorModel.add(3);
        assertThat(calculatorModel.getDefaultValue(), is(3F));
    }

    @Test
    public void itShouldSubtractValue() {
        final CalculatorModel calculatorModel = new CalculatorModel();
        calculatorModel.add(2);
        calculatorModel.add(-2);
        assertThat(calculatorModel.getDefaultValue(), is(0F));
    }

    @Test
    public void itShouldMultiplyValueByZero() {
        final CalculatorModel calculatorModel = new CalculatorModel();
        calculatorModel.multiply(2);
        assertThat(calculatorModel.getDefaultValue(), is(0F));
    }

    @Test
    public void itShouldMultiplyValueByOne() {
        final CalculatorModel calculatorModel = new CalculatorModel();
        calculatorModel.add(1);
        calculatorModel.multiply(2);
        assertThat(calculatorModel.getDefaultValue(), is(2F));
    }

    @Test
    public void itShouldMultiplyValue() {
        final CalculatorModel calculatorModel = new CalculatorModel();
        calculatorModel.add(2);
        calculatorModel.multiply(2);
        assertThat(calculatorModel.getDefaultValue(), is(4F));
    }

    @Test
    public void itShouldDivideZeroByZero() {
        final CalculatorModel calculatorModel = new CalculatorModel();
        calculatorModel.divide(0);
        assertThat(calculatorModel.getDefaultValue(), is(Float.NaN));
    }

    @Test
    public void itShouldDividePositiveFloatByZero() {
        final CalculatorModel calculatorModel = new CalculatorModel();
        calculatorModel.add(1);
        calculatorModel.divide(0);
        assertThat(calculatorModel.getDefaultValue(), is(Float.POSITIVE_INFINITY));
    }

    @Test
    public void itShouldDivideNegativeFloatByZero() {
        final CalculatorModel calculatorModel = new CalculatorModel();
        calculatorModel.add(-1);
        calculatorModel.divide(0);
        assertThat(calculatorModel.getDefaultValue(), is(Float.NEGATIVE_INFINITY));
    }

    @Test
    public void itShouldDivideFloatByOtherFloat() {
        final CalculatorModel calculatorModel = new CalculatorModel();
        calculatorModel.add(5);
        calculatorModel.divide(9);
        assertThat(calculatorModel.getDefaultValue(), is(0.5555556F));
    }

    @Test
    public void itShouldClearValue() {
        final CalculatorModel calculatorModel = new CalculatorModel();
        calculatorModel.add(10);
        calculatorModel.divide(5);
        assertThat(calculatorModel.getDefaultValue(), is(2F));
        calculatorModel.clear();
        assertThat(calculatorModel.getDefaultValue(), is(0F));
    }
}
