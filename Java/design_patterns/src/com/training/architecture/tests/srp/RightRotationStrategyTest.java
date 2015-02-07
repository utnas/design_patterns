package com.training.architecture.tests.srp;

import com.training.architecture.src.srp.Image;
import com.training.architecture.src.srp.rotation.strategy.RightRotationStrategy;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RightRotationStrategyTest {

    @Test
    public void itShouldRotateImageOnRight() {
        final RightRotationStrategy rightRotator = new RightRotationStrategy(new Image("My Path", "Right", 2));
        assertThat(rightRotator.apply().getDirection(), is("Right"));
    }
}
