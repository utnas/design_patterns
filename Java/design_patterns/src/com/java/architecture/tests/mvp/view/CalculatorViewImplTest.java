package com.java.architecture.tests.mvp.view;

import com.java.architecture.src.mvp.presenter.ICalculatorViewListener;
import com.java.architecture.src.mvp.view.CalculatorEvent;
import com.java.architecture.src.mvp.view.CalculatorViewImpl;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorViewImplTest {

    @Test
    public void itShouldSetDisplay() {
        final CalculatorViewImpl calculatorView = new CalculatorViewImpl();
        assertThat(calculatorView.setDisplay(8), is(CalculatorEvent.SET_DISPLAY));
    }

    @Test
    public void itShouldAddListener() {
        final CalculatorViewImpl calculatorView = new CalculatorViewImpl();
        final ICalculatorViewListener listener = new ICalculatorViewListener() {
            public CalculatorEvent clickButton() {
                return CalculatorEvent.BUTTON_CLICKED;
            }
        };
        calculatorView.addListener(listener);
        assertThat(calculatorView.getDisplay(), is(""));
    }

}
