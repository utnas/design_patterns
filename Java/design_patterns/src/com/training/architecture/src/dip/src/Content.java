package com.training.architecture.src.dip.src;

public class Content<T> implements IContent {

    private final T message;

    public Content(final T message) {
        this.message = message;
    }

    public T getMessage() {
        return message;
    }
}
