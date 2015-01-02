package com.java.architecture.src.mvc.utils.storage;

import com.java.architecture.src.mvc.model.Pizza;
import com.java.patterns.tests.CollectionHelper;

import java.util.ArrayList;

import static com.google.common.collect.Lists.newArrayList;


public final class StorageEngine implements IStorage {
    final ArrayList store = newArrayList();

    public void set(final String from, final Pizza toBeStored) {
        final Pizza pizza = CollectionHelper.getPizza(from, store);
        if (pizza != null) {
            store.add(toBeStored);
            store.remove(from);
        }
    }

    public <T> T add(final String name, final StorageResultHandler<T> resultHandler) {
        return resultHandler.handle(name, store);
    }

    public <T> T delete(final String name, final StorageResultHandler<T> resultHandler) {
        return resultHandler.handle(name, store);
    }

    public <T> T get(final String name, final StorageResultHandler<T> resultHandler) {
        return resultHandler.handle(name, store);
    }
}
