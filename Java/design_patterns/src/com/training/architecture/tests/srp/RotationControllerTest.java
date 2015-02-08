package com.training.architecture.tests.srp;

import com.training.architecture.src.clean_code.srp.Image;
import com.training.architecture.src.clean_code.srp.rotation.controller.RotationController;
import com.training.architecture.src.clean_code.srp.rotation.strategy.LeftRotationStrategy;
import com.training.architecture.src.clean_code.srp.rotation.strategy.RightRotationStrategy;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RotationControllerTest {

    @Test
    public void itShouldApplyLeftRotationStrategy() {
        LeftRotationStrategy leftRotationStrategy = Mockito.mock(LeftRotationStrategy.class);
        Mockito.when(leftRotationStrategy.apply()).thenReturn(new Image("", "Left", 0));

        assertThat(new RotationController(leftRotationStrategy).applyRotation().getDirection(), is("Left"));
    }

    @Test
    public void itShouldApplyRightRotationStrategy() {
        RightRotationStrategy rightRotationStrategy = Mockito.mock(RightRotationStrategy.class);
        Mockito.when(rightRotationStrategy.apply()).thenReturn(new Image("", "Right", 0));

        assertThat(new RotationController(rightRotationStrategy).applyRotation().getDirection(), is("Right"));
    }
}
