package com.java.architecture.src.mvp.presenter;

import com.java.architecture.src.mvp.view.CalculatorEvent;
import com.java.patterns.src.strategy.Context;

public interface ICalculatorViewListener {

    public float clickButton(final Context context);
}
