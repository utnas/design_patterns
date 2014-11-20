package com.java.architecture.src.dip;
// https://www.dotnetdojo.com/concevoir-des-applications-solid-lsp/

public class Content implements IContent {

    private final String message;

    public Content(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
