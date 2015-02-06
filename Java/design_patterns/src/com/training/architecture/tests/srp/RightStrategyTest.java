package com.training.architecture.tests.srp;

import com.training.architecture.src.srp.Image;
import com.training.architecture.src.srp.rotation_strategy.RightStrategy;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RightStrategyTest {

    @Test
    public void itShouldRotateImageOnRight() {
        final RightStrategy rightRotator = new RightStrategy(new Image("My Path", "Right", 2));
        assertThat(rightRotator.apply().getDirection(), is("Right"));
    }
}
