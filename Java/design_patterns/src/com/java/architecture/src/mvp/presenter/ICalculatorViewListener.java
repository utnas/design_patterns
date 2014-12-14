package com.java.architecture.src.mvp.presenter;

import com.java.architecture.src.mvp.view.CalculatorEvent;

public interface ICalculatorViewListener {

    public CalculatorEvent clickButton();
}
