package com.java.architecture.tests.dip;

import com.java.architecture.src.dip.src.Content;
import com.java.architecture.src.dip.src.VirtualRenderer;
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
