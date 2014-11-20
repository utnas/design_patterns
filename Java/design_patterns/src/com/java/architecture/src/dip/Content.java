package com.java.architecture.src.dip;

public class Content implements IContent {

    private final String message;

    public Content(final String message) {

        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
