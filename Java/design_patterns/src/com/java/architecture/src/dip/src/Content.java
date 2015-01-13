package com.java.architecture.src.dip.src;
// https://www.dotnetdojo.com/concevoir-des-applications-solid-lsp/

public class Content<T> implements IContent {

    private final T message;

    public Content(final T message) {
        this.message = message;
    }

    public T getMessage() {
        return message;
    }
}
