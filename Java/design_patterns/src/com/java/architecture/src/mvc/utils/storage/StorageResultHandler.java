package com.java.architecture.src.mvc.utils.storage;

import java.util.ArrayList;

public interface StorageResultHandler<T> {
    public T handle(final String subject, final ArrayList store);
}