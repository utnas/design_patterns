package com.training.patterns.src.observer.observe;

import com.training.patterns.src.observer.observer.IObserver;

import java.util.List;

public class Code extends Observe {
    private String value;

    public Code(final List<IObserver> observers) {
        super(observers);
    }

    @Override
    public String getValue() {
        return value;
    }

    public void setValue(final String changed) {
        value = changed;
        notifyObservers();
    }
}
