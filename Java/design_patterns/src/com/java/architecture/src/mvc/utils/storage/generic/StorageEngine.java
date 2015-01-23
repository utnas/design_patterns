package com.java.architecture.src.mvc.utils.storage.generic;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.java.architecture.src.mvc.model.ConcretePizza;
import com.java.architecture.src.mvc.model.FakePizza;
import com.java.architecture.src.mvc.model.Pizza;
import com.java.patterns.tests.CollectionHelper;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static com.google.common.collect.Lists.newArrayList;


public final class StorageEngine implements IStorage {
    final ArrayList<ConcretePizza> store = newArrayList();

    public final void set(final String from, final ConcretePizza toBeStored) {
        final ConcretePizza pizza = CollectionHelper.getPizza(from, store);
        if (pizza != null) {
            store.add(toBeStored);
            final Pizza toBeRemoved = getPizzaByRealName(from);
            store.remove(toBeRemoved);
        }
    }

    public final <T> T add(final String name, final StorageResultHandler<T> resultHandler) {
        return resultHandler.handle(name, store);
    }

    public final <T> T delete(final String name, final StorageResultHandler<T> resultHandler) {
        return resultHandler.handle(name, store);
    }

    public final <T> T get(final String name, final StorageResultHandler<T> resultHandler) {
        return resultHandler.handle(name, store);
    }

    public final Pizza getPizzaByRealName(final String from) {
        try {
            return Iterables.find(store, new Predicate<ConcretePizza>() {
                public boolean apply(final ConcretePizza pizza) {
                    return pizza.getRealName().equals(from);
                }
            });
        } catch (NoSuchElementException e) {
            return new FakePizza();
        }
    }
}
