package com.java.patterns.src.observer;

import java.util.List;

public interface IObservable {

    public void addObserver(final IObserver observer);

    public void removeObserver(final IObserver observer);

    public void notifyObservers();

    public int getLength();

    public int incrementLength();

    public void addModifier(final String name);

    public void triggerNotification();

    public List<String> getObservers();
}
