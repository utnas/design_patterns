package com.java.architecture.tests.mvc.controller;

import com.java.architecture.src.mvc.controller.PizzaController;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PizzaControllerTest {

    @Test
    public void createPizzaTest() {
        final PizzaController pizzaController = new PizzaController();
        assertThat(pizzaController.createPizza("Margarita"), is(true));
    }

    @Test
    public void deletePizzaTest() {
        final PizzaController pizzaController = new PizzaController();
        assertThat(pizzaController.deletePizza("Margarita"), is(true));
    }
}
