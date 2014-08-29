package com.java.patterns.tests.factory;

import com.java.patterns.src.factory.Car;
import com.java.patterns.src.factory.CarFactoryImpl;
import org.junit.Test;

import static com.java.patterns.src.factory.Ford.Model.FIESTA;
import static com.java.patterns.src.factory.Ford.Model.FOCUS;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CarFactoryImplTest {

    @Test
    public void testCreateFordFiesta() {
        CarFactoryImpl carFactory = new CarFactoryImpl();
        Car fiesta = carFactory.makeCar(FIESTA);
        assertThat(fiesta.getModel(), is("FIESTA"));
    }

    @Test
    public void testCreateFordFocus() {
        CarFactoryImpl carFactory = new CarFactoryImpl();
        Car focus = carFactory.makeCar(FOCUS);
        assertThat(focus.getModel(), is("FOCUS"));
    }
}
