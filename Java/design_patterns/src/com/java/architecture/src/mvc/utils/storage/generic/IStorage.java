package com.java.architecture.src.mvc.utils.storage.generic;

import com.java.architecture.src.mvc.model.ConcretePizza;

public interface IStorage {
    public <T> T add(final String name, final StorageResultHandler<T> resultHandler);

    public <T> T delete(final String name, final StorageResultHandler<T> resultHandler);

    public <T> T get(final String name, final StorageResultHandler<T> resultHandler);

    public void set(final String from, final ConcretePizza toBeStored);
}