package com.java.patterns.src.observer;

public interface IObservable {

    public void addObserver(final IObserver observer);

    public void removeObserver(final IObserver observer);

    public void notifyObservers();

    public int getLength();

    public void incrementLength();

    public void addModifier(final String name);

    public void triggerNotification();
}
