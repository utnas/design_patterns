package com.java.architecture.src.mvc.controller;

import com.java.architecture.src.mvc.model.Pizza;
import com.java.architecture.src.mvc.utils.storage.IStorage;
import com.java.architecture.src.mvc.utils.storage.StorageEngine;
import com.java.architecture.src.mvc.utils.storage.StorageResultHandler;

import java.util.ArrayList;

public class PizzaController {
    final IStorage storageEngine = new StorageEngine();

    public boolean createPizza(final String nameOfPizza) {
        return storageEngine.add(nameOfPizza, new StorageResultHandler<Boolean>() {
            public Boolean handle(Object subject, ArrayList store) {
                return store.add(subject);
            }
        });
    }

    public boolean deletePizza(final String nameOfPizza) {
        return storageEngine.delete(nameOfPizza, new StorageResultHandler<Boolean>() {
            public Boolean handle(Object subject, ArrayList store) {
                return store.remove(subject);
            }
        });
    }

    public Pizza readPizza(final String name) {
        return storageEngine.get(name, new StorageResultHandler<Pizza>() {
                    public Pizza handle(Object subject, ArrayList store) {
                        return find((String) subject, store);
                    }

                    private Pizza find(final String subject, ArrayList store) {
                        if (store.contains(subject)) {
                            for (final Object stored : store) {
                                if (((Pizza) stored).getRealName().equals(subject)) {
                                    return (Pizza) stored;
                                }
                            }
                        }
                        return null;
                    }
                }
        );
    }

    public void updatePizza(final String from, final String to) {
        storageEngine.set(from, to);
    }
}
