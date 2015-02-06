package com.training.architecture.tests.srp;

import com.training.architecture.src.srp.Image;
import com.training.architecture.src.srp.rotation_strategy.LeftStrategy;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LeftStrategyTest {

    @Test
    public void itShouldLeftRotateImage() {
        final LeftStrategy leftRotator = new LeftStrategy(new Image("My path", "Left", 50));
        assertThat(leftRotator.apply().getDirection(), is("Left"));
    }
}
