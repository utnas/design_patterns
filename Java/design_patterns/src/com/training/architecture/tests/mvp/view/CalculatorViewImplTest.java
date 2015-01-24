package com.training.architecture.tests.mvp.view;

import com.training.architecture.src.mvp.model.CalculatorModel;
import com.training.architecture.src.mvp.presenter.CalculatorPresenter;
import com.training.architecture.src.mvp.presenter.ICalculatorViewListener;
import com.training.architecture.src.mvp.view.CalculatorEvent;
import com.training.architecture.src.mvp.view.CalculatorViewImpl;
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
        final ICalculatorViewListener listener = new CalculatorPresenter(new CalculatorModel(), new CalculatorViewImpl());

        calculatorView.addListener(listener);
        assertThat(calculatorView.getDisplay(), is(0F));
        calculatorView.setDisplay(3F);
        assertThat(calculatorView.getDisplay(), is(3F));
    }

}
