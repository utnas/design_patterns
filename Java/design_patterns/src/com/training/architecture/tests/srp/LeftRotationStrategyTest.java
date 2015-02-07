package com.training.architecture.tests.srp;

import com.training.architecture.src.srp.Image;
import com.training.architecture.src.srp.rotation.strategy.LeftRotationStrategy;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LeftRotationStrategyTest {

    @Test
    public void itShouldLeftRotateImage() {
        final LeftRotationStrategy leftRotator = new LeftRotationStrategy(new Image("My path", "Left", 50));
        assertThat(leftRotator.apply().getDirection(), is("Left"));
    }
}
