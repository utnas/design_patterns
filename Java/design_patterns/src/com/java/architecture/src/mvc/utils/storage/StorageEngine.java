package com.java.architecture.src.mvc.utils.storage;

import com.java.architecture.src.mvc.model.Pizza;
import com.java.patterns.tests.CollectionHelper;

import java.util.ArrayList;

import static com.google.common.collect.Lists.newArrayList;


public final class StorageEngine<T> implements IStorage {
    final ArrayList store = newArrayList();

    public void set(final String from, final String to) {
        final Pizza pizza = CollectionHelper.getPizza(from, store);
        if (pizza != null) {
            store.add(new Pizza(to));
            store.remove(from);
        }
    }

    public <T> T add(final String name, StorageResultHandler<T> resultHandler) {
        return resultHandler.handle(name, store);
    }

    public <T> T delete(final String name, StorageResultHandler<T> resultHandler) {
        return resultHandler.handle(name, store);
    }

    public <T> T get(final String name, StorageResultHandler<T> resultHandler) {
        return resultHandler.handle(name, store);
    }
}
