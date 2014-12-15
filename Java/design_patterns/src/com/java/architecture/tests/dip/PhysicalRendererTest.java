package com.java.architecture.tests.dip;


import com.java.architecture.src.dip.src.Content;
import com.java.architecture.src.dip.src.PhysicalRenderer;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhysicalRendererTest {

    @Test
    public void testShowResult() {
        final PhysicalRenderer physicalRenderer = new PhysicalRenderer(new Content("Content"));
        assertThat(physicalRenderer.displayResult().getMessage(), is("Content"));
    }

}
