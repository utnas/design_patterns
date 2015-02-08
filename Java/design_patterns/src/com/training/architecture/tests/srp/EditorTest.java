package com.training.architecture.tests.srp;

import com.training.architecture.src.clean_code.srp.Image;
import com.training.architecture.src.clean_code.srp.editor.BrightnessController;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class EditorTest {

    @Test
    public void itShouldModifyTheBrightness() {
        Image image = Mockito.mock(Image.class);
        Mockito.when(image.getBrightness()).thenReturn(30);

        assertThat(new BrightnessController().increase(image, 30).getBrightness(), is(60));
    }

    @Test
    public void itShouldDecreaseBrightness() {
        Image image = Mockito.mock(Image.class);
        Mockito.when(image.getBrightness()).thenReturn(150);

        assertThat(new BrightnessController().decrease(image, 23).getBrightness(), is(127));
    }
}
