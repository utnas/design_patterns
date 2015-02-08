package com.training.architecture.tests.srp;

import com.training.architecture.src.clean_code.srp.Image;
import com.training.architecture.src.clean_code.srp.rotation.strategy.RightRotationStrategy;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RightRotationStrategyTest {

    @Test
    public void itShouldRotateImageOnRight() {
        Image image = Mockito.mock(Image.class);
        Mockito.when(image.getDirection()).thenReturn("Right");
        final RightRotationStrategy rightRotator = new RightRotationStrategy(image);
        assertThat(rightRotator.apply().getDirection(), is("Right"));
    }
}
