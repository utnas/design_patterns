package com.java.architecture.src.mvc.orm;

import com.java.architecture.src.mvc.model.Pizza;

public interface IStorage {
    public boolean add(final Object name);

    public boolean delete(final String name);

    public Pizza get(final String name);

    public boolean set(final String from, final String to);
}
