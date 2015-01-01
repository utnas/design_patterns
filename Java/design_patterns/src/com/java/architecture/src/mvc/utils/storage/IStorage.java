package com.java.architecture.src.mvc.utils.storage;

public interface IStorage {
    public <T> T add(final Object name, final StorageResultHandler<T> resultHandler);

    public <T> T delete(final Object name, final StorageResultHandler<T> resultHandler);

    public <T> T get(final Object name, final StorageResultHandler<T> resultHandler);

    public void set(final Object from, final Object to);
}