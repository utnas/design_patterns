package com.java.architecture.src.mvc.utils.storage;

import com.java.architecture.src.mvc.model.Pizza;
import com.java.patterns.tests.CollectionHelper;

import java.util.ArrayList;

public class PizzaStorageEngineImpl {
    final StorageEngine storageEngine;

    public PizzaStorageEngineImpl() {
        storageEngine = new StorageEngine();
    }

    public Boolean addPizza(String nameOfPizza) {
        return storageEngine.add(nameOfPizza, new StorageResultHandler<Boolean>() {
            public Boolean handle(final String subject, final ArrayList store) {
                return store.add(new Pizza(subject));
            }
        });
    }

    public Object removePizza(final String nameOfPizza) {
        return storageEngine.delete(nameOfPizza, new StorageResultHandler<Boolean>() {
            public Boolean handle(final String subject, ArrayList store) {
                return store.remove(CollectionHelper.getPizza(nameOfPizza, store));
            }
        });
    }

    public Object getPizza(final String name) {
        return storageEngine.get(name, new StorageResultHandler() {
            @Override
            public Pizza handle(String subject, ArrayList store) {
                return CollectionHelper.getPizza(subject, store);
            }
        });
    }

    public void replacePizza(final String from, final String to) {
        storageEngine.set(from, new Pizza(to));
    }

}
