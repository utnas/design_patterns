package com.java.patterns.src.observer;

public interface IObserver {
    public void update(final IObservable observable);

    public void AddNotification(final String notification);
}
