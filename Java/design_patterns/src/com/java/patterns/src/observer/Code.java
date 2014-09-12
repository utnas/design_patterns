package com.java.patterns.src.observer;

import java.util.LinkedList;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.newLinkedList;
import static java.util.Collections.unmodifiableList;

public class Code implements IObservable {
    private int size;
    private List<IObserver> observers;
    private LinkedList<String> modifiers;

    public Code() {
        size = 0;
        observers = newArrayList();
        modifiers = newLinkedList();
    }

    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        if (size != 0) {
            for (final IObserver observer : observers) {
                observer.AddNotification("Code was updated by " + getLastModifier() + ". The current size is " + size);
            }
        }
    }

    public int getLength() {
        return size;
    }

    public int incrementLength() {
        return ++size;
    }

    public void addModifier(String name) {
        modifiers.add(name);
    }

    public void triggerNotification() {
        notifyObservers();
    }

    @Override
    public List<String> getObservers() {
        List<String> result = newArrayList();
        for (final IObserver observer : observers) {
            result.add(((User) observer).getName());
        }
        return unmodifiableList(result);
    }

    public String getLastModifier() {
        if (modifiers.isEmpty()) {
            return "";
        }
        return modifiers.getLast();
    }
}
