package com.training.architecture.tests.srp;

import com.training.architecture.src.srp.Image;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ImageTest {
    @Test
    public void itShouldCreateAImage() {
        assertThat(new Image("My path", "Right", 0).getPath(), is("My path"));
    }
}