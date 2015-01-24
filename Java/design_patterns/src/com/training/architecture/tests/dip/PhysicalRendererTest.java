package com.training.architecture.tests.dip;


import com.training.architecture.src.dip.src.Content;
import com.training.architecture.src.dip.src.IContent;
import com.training.architecture.src.dip.src.renderer.physical.PhysicalRenderer;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhysicalRendererTest {

    @Test
    public void testShowResult() {
        final PhysicalRenderer<IContent> physicalRenderer = new PhysicalRenderer<>(new Content<String>("Content"));
        String message = physicalRenderer.displayResult();
        assertThat(message, is("Content"));
    }

}
