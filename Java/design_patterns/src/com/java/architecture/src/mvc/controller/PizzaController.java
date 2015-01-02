package com.java.architecture.src.mvc.controller;

import com.java.architecture.src.mvc.model.Pizza;
import com.java.architecture.src.mvc.utils.storage.PizzaStorageEngineImpl;

public class PizzaController {
    final PizzaStorageEngineImpl storageEngine = new PizzaStorageEngineImpl();

    public Boolean createPizza(final String nameOfPizza) {
        return storageEngine.addPizza(nameOfPizza);
    }

    public Boolean deletePizza(final String nameOfPizza) {
        return (Boolean) storageEngine.removePizza(nameOfPizza);
    }

    public Pizza readPizza(final String name) {
        return (Pizza) storageEngine.getPizza(name);
    }

    public void updatePizza(final String from, final String to) {
        storageEngine.replacePizza(from, to);
    }
}
