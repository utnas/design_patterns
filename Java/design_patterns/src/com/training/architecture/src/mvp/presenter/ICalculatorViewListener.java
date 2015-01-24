package com.training.architecture.src.mvp.presenter;

import com.training.patterns.src.strategy.Context;

public interface ICalculatorViewListener {

    public float clickButton(final Context context);
}
