package com.java.architecture.src.mvc.utils.storage;

import java.util.ArrayList;

import static com.google.common.collect.Lists.newArrayList;


public class StorageEngine<T> implements IStorage {
    final ArrayList store = newArrayList();

    public void set(final String from, final String to) {
    }

    public <T> T add(final Object name, StorageResultHandler<T> resultHandler) {
        return resultHandler.handle(name, store);
    }

    public <T> T delete(final String name, StorageResultHandler<T> resultHandler) {
        return resultHandler.handle(name, store);
    }

    public <T> T get(final String name, StorageResultHandler<T> resultHandler) {
        return resultHandler.handle(name, store);
    }
}
