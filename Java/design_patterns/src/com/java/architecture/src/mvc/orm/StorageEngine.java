package com.java.architecture.src.mvc.orm;

import com.java.architecture.src.mvc.model.Pizza;

public class StorageEngine implements ORM{

    public boolean add(final Object name) {
        return true;
    }

    public boolean delete(final String name) {
        return true;
    }

    public Pizza get(final String name) {
        return (Pizza) new Object();
    }

    public boolean set(final String from, final String to) {
        return true;
    }
}
