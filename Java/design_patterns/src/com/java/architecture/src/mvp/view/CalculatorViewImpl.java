package com.java.architecture.src.mvp.view;

import com.google.common.collect.Lists;
import com.java.architecture.src.mvp.presenter.ICalculatorViewListener;

import java.util.List;

public class CalculatorViewImpl implements ICalculatorView {
    private List<ICalculatorViewListener> listeners = Lists.newArrayList();
    private Display display;

    public CalculatorViewImpl() {
        this.display = new Display("");
    }

    @Override
    public CalculatorEvent setDisplay(final float value) {
        return display.setValue(value);
    }

    @Override
    public CalculatorEvent addListener() {
        return CalculatorEvent.LISTENER_ADDED;
    }

    @Override
    public void addListener(final ICalculatorViewListener listener) {
        listeners.add(listener);
    }

    private class Display {
        private String field;

        private Display(String field) {
            this.field = field;
        }

        public CalculatorEvent setValue(final float value) {
            field = String.valueOf(value);
            return CalculatorEvent.SET_DISPLAY;
        }

        public String getField() {
            return field;
        }
    }
}
