package com.java.architecture.src.mvc.controller;

import com.java.architecture.src.mvc.model.ConcretePizza;
import com.java.architecture.src.mvc.utils.storage.concreate.PizzaStorageEngineImpl;

public class PizzaController {
    final PizzaStorageEngineImpl storageEngine = new PizzaStorageEngineImpl();

    public Boolean createPizza(final String nameOfPizza) {
        return storageEngine.addPizza(nameOfPizza);
    }

    public Boolean deletePizza(final String nameOfPizza) {
        return (Boolean) storageEngine.removePizza(nameOfPizza);
    }

    public ConcretePizza readPizza(final String name) {
        return (ConcretePizza) storageEngine.getPizza(name);
    }

    public void updatePizza(final String from, final String to) {
        storageEngine.replacePizza(from, to);
    }
}
