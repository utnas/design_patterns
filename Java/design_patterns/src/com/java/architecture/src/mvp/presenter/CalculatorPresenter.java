package com.java.architecture.src.mvp.presenter;

import com.java.architecture.src.mvp.model.ICalculator;
import com.java.architecture.src.mvp.view.CalculatorEvent;
import com.java.architecture.src.mvp.view.ICalculatorView;

public class CalculatorPresenter implements ICalculatorViewListener {
    private final ICalculator calculator;
    private final ICalculatorView calculatorView;

    public CalculatorPresenter(final ICalculator calculator, final ICalculatorView calculatorView) {
        this.calculator = calculator;
        this.calculatorView = calculatorView;
    }


    @Override
    public CalculatorEvent clickButton() {
        return CalculatorEvent.BUTTON_CLICKED;
    }
}
