package com.training.architecture.tests.srp;

import com.training.architecture.src.srp.Image;
import com.training.architecture.src.srp.strategy.LeftStrategy;
import com.training.architecture.src.srp.strategy.RightStrategy;
import com.training.architecture.src.srp.strategy.RotatorContext;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RotatorContextTest {

    @Test
    public void testApplyLeftRotation() {
        final LeftStrategy left = new LeftStrategy(new Image("my path", "Left", 12));
        new RotatorContext(left);
        assertThat(left.apply().getDirection(), is("Left"));
    }

    @Test
    public void testApplyRightRotation() {
        final RightStrategy right = new RightStrategy(new Image("my path", "Left", 12));
        new RotatorContext(right);
        assertThat(right.apply().getDirection(), is("Right"));
    }
}