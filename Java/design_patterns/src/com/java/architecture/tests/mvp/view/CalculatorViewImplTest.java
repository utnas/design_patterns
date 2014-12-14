package com.java.architecture.tests.mvp.view;

import com.java.architecture.src.mvp.view.CalculatorEvent;
import com.java.architecture.src.mvp.view.CalculatorViewImpl;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorViewImplTest {

    @Test
    public void itShouldSetDisplay() {
        final CalculatorViewImpl calculatorView = new CalculatorViewImpl();
        assertThat(calculatorView.setDisplay(), is(CalculatorEvent.SET_DISPLAY));
    }

    @Test
    public void itShouldAddListener() {
        final CalculatorViewImpl calculatorView = new CalculatorViewImpl();
        assertThat(calculatorView.addListener(), is(CalculatorEvent.LISTNER_ADDED));
    }

}
