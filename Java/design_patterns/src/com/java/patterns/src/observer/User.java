package com.java.patterns.src.observer;

public class User implements IObserver {

    private String name;
    private String lastNotification;

    public User(String name) {
        this.name = name;
        lastNotification = "";
    }

    public void update(IObservable observable) {
        observable.incrementLength();
        observable.addModifier(this.getName());
        observable.triggerNotification();
    }

    public void AddNotification(final String notification) {
        lastNotification = notification;
    }

    public String getLastNotification() {
        return lastNotification;
    }

    public String getName() {
        return name;
    }
}
