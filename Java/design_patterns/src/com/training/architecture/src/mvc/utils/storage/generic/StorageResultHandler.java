package com.training.architecture.src.mvc.utils.storage.generic;

import java.util.ArrayList;

public interface StorageResultHandler<T> {
    public T handle(final String subject, final ArrayList store);
}