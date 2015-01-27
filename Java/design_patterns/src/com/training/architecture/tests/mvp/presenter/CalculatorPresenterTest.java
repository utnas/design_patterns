package com.training.architecture.tests.mvp.presenter;

import com.training.architecture.src.mvp.model.CalculatorModel;
import com.training.architecture.src.mvp.presenter.CalculatorPresenter;
import com.training.architecture.src.mvp.view.CalculatorViewImpl;
import com.training.patterns.src.strategy.AdditionStrategy;
import com.training.patterns.src.strategy.Context;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorPresenterTest {

    @Test
    public void itShouldTriggerEventWhenButtonIsClicked() {
        final CalculatorPresenter presenter = new CalculatorPresenter(new CalculatorModel(), new CalculatorViewImpl());
        assertThat(presenter.clickButton(new Context(new AdditionStrategy(2F, 1F))), is(3F));
    }
}
