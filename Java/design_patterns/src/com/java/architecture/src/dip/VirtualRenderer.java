package com.java.architecture.src.dip;

public class VirtualRenderer implements IRenderer {
    private final IContent content;

    public VirtualRenderer(final IContent content) {
        this.content = content;
    }

    public String getContent() {
        return content.getMessage();
    }

    public IContent displayResult() {
        return content;
    }
}
