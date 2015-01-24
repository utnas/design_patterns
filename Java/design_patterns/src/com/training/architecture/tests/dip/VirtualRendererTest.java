package com.training.architecture.tests.dip;

import com.training.architecture.src.dip.src.Content;
import com.training.architecture.src.dip.src.renderer.virtual.VirtualRenderer;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class VirtualRendererTest {

    @Test
    public void displayResultTest() {
        final VirtualRenderer<String> virtualRenderer = new VirtualRenderer<String>(new Content<String>("Hello"));
        assertThat(virtualRenderer.getContent(), is("Hello"));
    }

}
