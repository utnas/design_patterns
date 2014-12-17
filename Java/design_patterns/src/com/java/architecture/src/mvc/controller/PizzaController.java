package com.java.architecture.src.mvc.controller;

import com.java.architecture.src.mvc.model.Pizza;
import com.java.architecture.src.mvc.utils.storage.IStorage;
import com.java.architecture.src.mvc.utils.storage.StorageEngine;

public class PizzaController {
    final IStorage storageEngine = new StorageEngine();

    public boolean createPizza(final String nameOfPizza) {
        return storageEngine.add(new Pizza(nameOfPizza));
    }

    public boolean deletePizza(final String nameOfPizza) {
        return storageEngine.delete(nameOfPizza);
    }

    public Pizza readPizza(final String name) {
        return storageEngine.get(name);
    }

    public boolean updatePizza(final String from, final String to) {
        return storageEngine.set(from, to);
    }
}
