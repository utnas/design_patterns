package com.training.patterns.src.observer.observe;

import com.training.patterns.src.observer.observer.IObserver;

public interface IObserve {

    public abstract boolean addObserver(final IObserver observer);

    public abstract boolean removeObserver(final IObserver observer);

    public abstract void notifyObservers();

    public <T> T getValue();
}
