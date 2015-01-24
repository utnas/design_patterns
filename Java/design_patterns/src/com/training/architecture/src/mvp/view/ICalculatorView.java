package com.training.architecture.src.mvp.view;

import com.training.architecture.src.mvp.presenter.ICalculatorViewListener;

public interface ICalculatorView {

    public CalculatorEvent setDisplay(final float value);

    public void addListener(final ICalculatorViewListener listener);
}
