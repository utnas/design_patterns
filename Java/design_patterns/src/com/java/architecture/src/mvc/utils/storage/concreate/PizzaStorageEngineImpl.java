package com.java.architecture.src.mvc.utils.storage.concreate;

import com.java.architecture.src.mvc.model.ConcretePizza;
import com.java.architecture.src.mvc.utils.storage.generic.StorageEngine;
import com.java.architecture.src.mvc.utils.storage.generic.StorageResultHandler;
import com.java.patterns.tests.CollectionHelper;

import java.util.ArrayList;

public class PizzaStorageEngineImpl {
    final StorageEngine storageEngine;

    public PizzaStorageEngineImpl() {
        storageEngine = new StorageEngine();
    }

    public Boolean addPizza(final String nameOfPizza) {
        return storageEngine.add(nameOfPizza, (subject, store) -> store.add(new ConcretePizza(subject)));
    }

    public Object removePizza(final String nameOfPizza) {
        return storageEngine.delete(nameOfPizza, new StorageResultHandler<Boolean>() {
            public Boolean handle(final String subject, ArrayList store) {
                return store.remove(CollectionHelper.getPizza(nameOfPizza, store));
            }
        });
    }

    public Object getPizza(final String name) {
        return storageEngine.get(name, CollectionHelper::getPizza);
    }

    public void replacePizza(final String from, final String to) {
        storageEngine.set(from, new ConcretePizza(to));
    }

}
