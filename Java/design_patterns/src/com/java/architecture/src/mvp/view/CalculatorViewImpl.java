package com.java.architecture.src.mvp.view;

import static com.java.architecture.src.mvp.view.CalculatorEvent.SET_DISPLAY;

public class CalculatorViewImpl implements ICalculatorView {
    @Override
    public CalculatorEvent setDisplay() {
        return SET_DISPLAY;
    }

    @Override
    public CalculatorEvent addListener() {
        return CalculatorEvent.LISTNER_ADDED;
    }
}
