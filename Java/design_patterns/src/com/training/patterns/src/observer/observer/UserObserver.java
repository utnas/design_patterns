package com.training.patterns.src.observer.observer;

import com.training.patterns.src.observer.observe.IObserve;
import com.training.patterns.src.observer.observe.Observe;

public class UserObserver implements IObserver {

    private String name;
    private String message;
    private IObserve observe;

    public UserObserver(final String name) {
        this.name = name;
        message = "";
    }

    public void addObserve(final Observe observe) {
        this.observe = observe;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update() {
        message = observe.getValue();
    }

    public String getMessage() {
        return message;
    }
}
