package com.training.architecture.src.dip.src.renderer.physical;

import com.training.architecture.src.dip.src.IContent;
import com.training.architecture.src.dip.src.renderer.IRenderer;

public class PhysicalRenderer<T> implements IRenderer {
    private final IContent content;

    public PhysicalRenderer(final IContent content) {
        this.content = content;
    }

    public String displayResult() {
        return (String) content.getMessage();
    }
}
