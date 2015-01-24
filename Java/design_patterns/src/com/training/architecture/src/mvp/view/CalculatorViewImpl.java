package com.training.architecture.src.mvp.view;

import com.google.common.collect.Lists;
import com.training.architecture.src.mvp.presenter.ICalculatorViewListener;

import java.util.List;

public class CalculatorViewImpl implements ICalculatorView {
    private List<ICalculatorViewListener> listeners = Lists.newArrayList();
    private Display display;

    public CalculatorViewImpl() {
        this.display = new Display(0);
    }

    @Override
    public CalculatorEvent setDisplay(final float value) {
        return display.setValue(value);
    }


    @Override
    public void addListener(final ICalculatorViewListener listener) {
        listeners.add(listener);
    }

    public float getDisplay() {
        return display.getField();
    }

    private class Display {
        private float field;

        private Display(final float field) {
            this.field = field;
        }

        public CalculatorEvent setValue(final float value) {
            field = value;
            return CalculatorEvent.SET_DISPLAY;
        }

        public float getField() {
            return field;
        }
    }
}
