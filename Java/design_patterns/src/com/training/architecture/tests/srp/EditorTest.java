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
        assertThat(brightnessController.increase(new Image("My path", "None", 0), 30).getBrightness(), is(30));
    }

    @Test
    public void itShouldDecreaseBrightness() {
        final BrightnessController brightnessController = new BrightnessController();
        assertThat(brightnessController.decrease(new Image("My path", "None", 150), 23).getBrightness(), is(127));
    }
}
