package com.training.patterns.src.observer.observe;

import com.google.common.collect.Lists;
import com.training.patterns.src.observer.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Observe implements IObserve {

    private List<IObserver> observers;

    public Observe(final List<IObserver> observers) {
        this.observers = observers;
    }

    @Override
    public boolean addObserver(IObserver observer) {
        return observers.add(observer);
    }

    @Override
    public boolean removeObserver(IObserver observer) {
        return observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(IObserver::update);
    }

    @Override
    public String getValue() {
        return null;
    }


    public ArrayList<IObserver> getObservers() {
        return Lists.newArrayList(observers);
    }

}
