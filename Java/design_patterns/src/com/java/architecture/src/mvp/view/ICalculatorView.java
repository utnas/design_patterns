package com.java.architecture.src.mvp.view;

import com.java.architecture.src.mvp.presenter.ICalculatorViewListener;

public interface ICalculatorView {

    public CalculatorEvent setDisplay(final float value);

    public void addListener(final ICalculatorViewListener listener);
}
