package com.java.architecture.src.dip;

public class PhysicalRenderer implements IRenderer {
    private final IContent content;

    public PhysicalRenderer(final IContent content) {
        this.content = content;
    }

    public IContent displayResult() {
        return content;
    }
}
