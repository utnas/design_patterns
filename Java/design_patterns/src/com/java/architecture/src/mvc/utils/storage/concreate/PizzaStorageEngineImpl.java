package com.java.architecture.src.mvc.utils.storage.concreate;

import com.java.architecture.src.mvc.model.ConcretePizza;
import com.java.architecture.src.mvc.utils.storage.generic.StorageEngine;
import com.java.architecture.src.mvc.utils.storage.generic.StorageResultHandler;
import com.java.patterns.tests.CollectionHelper;

import java.util.ArrayList;

public final class PizzaStorageEngineImpl {
    final StorageEngine storageEngine;

    public PizzaStorageEngineImpl() {
        storageEngine = new StorageEngine();
    }

    public final Boolean addPizza(final String nameOfPizza) {
        return storageEngine.add(nameOfPizza, (subject, store) -> store.add(new ConcretePizza(subject)));
    }

    public final Object removePizza(final String nameOfPizza) {
        return storageEngine.delete(nameOfPizza, new StorageResultHandler<Boolean>() {
            public Boolean handle(final String subject, ArrayList store) {
                return store.remove(CollectionHelper.getPizza(nameOfPizza, store));
            }
        });
    }

    public final Object getPizza(final String name) {
        return storageEngine.get(name, CollectionHelper::getPizza);
    }

    public final void replacePizza(final String from, final String to) {
        storageEngine.set(from, new ConcretePizza(to));
    }

}
