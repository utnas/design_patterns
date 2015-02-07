package com.training.architecture.tests.srp;

import com.training.architecture.src.srp.BrightnessController;
import com.training.architecture.src.srp.Image;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class EditorTest {

    @Test
    public void itShouldModifyTheBrightness() {
        final BrightnessController brightnessController = new BrightnessController();
        Image image = new Image("My path", "None", 0);
        assertThat(brightnessController.increase(image, 30).getBrightness(), is(30));
    }

    @Test
    public void itShouldDecreaseBrightness() {
        final BrightnessController brightnessController = new BrightnessController();
        Image image = new Image("My path", "None", 150);
        assertThat(brightnessController.decrease(image, 23).getBrightness(), is(127));
    }
}
