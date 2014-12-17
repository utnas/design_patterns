package com.java.architecture.src.mvc.controller;

import com.java.architecture.src.mvc.model.Pizza;
import com.java.architecture.src.mvc.orm.StorageEngine;

public class PizzaController {
    final StorageEngine storageEngine = new StorageEngine();

    public boolean createPizza(final String nameOfPizza) {
        return storageEngine.add(new Pizza(nameOfPizza));
    }

    public boolean deletePizza(final String nameOfPizza) {
        return storageEngine.delete(nameOfPizza);
    }
}
