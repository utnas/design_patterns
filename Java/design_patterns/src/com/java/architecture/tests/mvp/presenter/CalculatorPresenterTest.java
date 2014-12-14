package com.java.architecture.tests.mvp.presenter;

import com.java.architecture.src.mvp.model.CalculatorModel;
import com.java.architecture.src.mvp.model.ICalculator;
import com.java.architecture.src.mvp.presenter.CalculatorPresenter;
import com.java.architecture.src.mvp.view.CalculatorEvent;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorPresenterTest {

    @Test
    public void itShouldTriggerEventWhenButtonIsClicked() {
        ICalculator calculator = new CalculatorModel();
        final CalculatorPresenter presenter = new CalculatorPresenter(calculator);
        assertThat(presenter.clickButton(), is(CalculatorEvent.BUTTON_CLICKED));
    }
}
