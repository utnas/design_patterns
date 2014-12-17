package com.java.architecture.src.mvc.util;

import com.java.architecture.src.mvc.model.Pizza;

public class StorageEngine implements IStorage {

    public boolean add(final Object name) {
        return true;
    }

    public boolean delete(final String name) {
        return true;
    }

    public Pizza get(final String name) {
        return new Pizza("");
    }

    public boolean set(final String from, final String to) {
        return true;
    }
}
