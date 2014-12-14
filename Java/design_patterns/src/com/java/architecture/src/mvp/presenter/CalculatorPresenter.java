package com.java.architecture.src.mvp.presenter;

import com.java.architecture.src.mvp.model.ICalculator;
import com.java.architecture.src.mvp.view.CalculatorEvent;

public class CalculatorPresenter implements ICalculatorViewListener {
    private final ICalculator calculator;

    public CalculatorPresenter(ICalculator calculator) {
        this.calculator = calculator;
    }


    @Override
    public CalculatorEvent clickButton() {
        return CalculatorEvent.BUTTON_CLICKED;
    }
}
