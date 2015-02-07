package com.training.architecture.tests.srp;

import com.training.architecture.src.srp.Image;
import com.training.architecture.src.srp.rotator.strategy.LeftStrategy;
import com.training.architecture.src.srp.rotator.strategy.RightStrategy;
import com.training.architecture.src.srp.rotator.strategy.RotatorContext;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RotatorContextTest {

    @Test
    public void testApplyLeftRotation() {
        LeftStrategy leftStrategy = new LeftStrategy(new Image("my path", "Left", 12));
        RotatorContext rotatorContext = new RotatorContext(leftStrategy);
        assertThat(rotatorContext.applyRotation().getDirection(), is("Left"));
    }

    @Test
    public void testApplyRightRotation() {
        RightStrategy rightStrategy = new RightStrategy(new Image("my path", "Left", 12));
        RotatorContext rotatorContext = new RotatorContext(rightStrategy);
        assertThat(rotatorContext.applyRotation().getDirection(), is("Right"));
    }
}