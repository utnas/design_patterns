package com.training.architecture.tests.srp;

import com.training.architecture.src.clean_code.srp.Image;
import com.training.architecture.src.clean_code.srp.rotation.controller.RotationController;
import com.training.architecture.src.clean_code.srp.rotation.strategy.LeftRotationStrategy;
import com.training.architecture.src.clean_code.srp.rotation.strategy.RightRotationStrategy;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RotationControllerTest {

    @Test
    public void itShouldApplyLeftRotationStrategy() {
        final LeftRotationStrategy strategy = new LeftRotationStrategy(new Image("path", "None", 12));
        assertThat(new RotationController(strategy).applyRotation().getDirection(), is("Left"));
    }

    @Test
    public void itShouldApplyRightRotationStrategy() {
        final RightRotationStrategy strategy = new RightRotationStrategy(new Image("path", "None", 12));
        assertThat(new RotationController(strategy).applyRotation().getDirection(), is("Right"));
    }
}
