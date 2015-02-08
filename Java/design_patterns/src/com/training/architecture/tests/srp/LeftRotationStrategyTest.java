package com.training.architecture.tests.srp;

import com.training.architecture.src.clean_code.srp.Image;
import com.training.architecture.src.clean_code.srp.rotation.strategy.LeftRotationStrategy;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LeftRotationStrategyTest {

    @Test
    public void itShouldLeftRotateImage() {
        Image image = Mockito.mock(Image.class);
        Mockito.when(image.getDirection()).thenReturn("Left");

        final LeftRotationStrategy leftRotator = new LeftRotationStrategy(image);
        assertThat(leftRotator.apply().getDirection(), is("Left"));
    }
}
