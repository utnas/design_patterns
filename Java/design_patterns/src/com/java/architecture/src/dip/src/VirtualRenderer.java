package com.java.architecture.src.dip.src;

import com.java.architecture.src.dip.src.IContent;
import com.java.architecture.src.dip.src.IRenderer;

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
