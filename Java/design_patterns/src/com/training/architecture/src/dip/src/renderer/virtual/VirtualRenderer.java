package com.training.architecture.src.dip.src.renderer.virtual;

import com.training.architecture.src.dip.src.IContent;
import com.training.architecture.src.dip.src.renderer.IRenderer;

public class VirtualRenderer<T> implements IRenderer {
    private final IContent content;

    public VirtualRenderer(final IContent content) {
        this.content = content;
    }

    public T getContent() {
        return (T) content.getMessage();
    }

    public IContent displayResult() {
        return content;
    }
}
