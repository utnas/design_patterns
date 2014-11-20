package com.java.architecture.tests;

import com.java.architecture.src.dip.Content;
import com.java.architecture.src.dip.VirtualRenderer;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class VirtualRendererTest {

    @Test
    public void displayResultTest() {
        final VirtualRenderer virtualRenderer = new VirtualRenderer(new Content("Hello"));
        assertThat(virtualRenderer.getContent(), is("Hello"));
    }

}
