package com.training.architecture.src.mvp.presenter;

import com.training.architecture.src.mvp.model.ICalculator;
import com.training.architecture.src.mvp.view.ICalculatorView;
import com.training.patterns.src.strategy.Context;

public class CalculatorPresenter implements ICalculatorViewListener {
    private final ICalculator calculator;
    private final ICalculatorView calculatorView;
    private float current;

    public CalculatorPresenter(final ICalculator calculator, final ICalculatorView calculatorView) {
        this.calculator = calculator;
        this.calculatorView = calculatorView;

        current = 0F;
        calculatorView.setDisplay(current);
        calculatorView.addListener(this);
    }


    @Override
    public float clickButton(final Context context) {
        return context.executeStrategy();
    }
}
