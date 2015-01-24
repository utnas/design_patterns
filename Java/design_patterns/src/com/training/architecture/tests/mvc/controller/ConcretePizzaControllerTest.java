package com.training.architecture.tests.mvc.controller;

import com.training.architecture.src.mvc.controller.PizzaController;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConcretePizzaControllerTest {

    @Test
    public void createPizzaTest() {
        final PizzaController pizzaController = new PizzaController();
        assertThat(pizzaController.createPizza("Margarita"), is(true));
    }

    @Test
    public void readPizzaTest() {
        final PizzaController controller = new PizzaController();
        controller.createPizza("Margarita");
        assertThat(controller.readPizza("Margarita").getRealName(), is("Margarita"));
    }

    @Test
    public void updatePizzaTest() {
        final PizzaController pizzaController = new PizzaController();
        pizzaController.createPizza("Margarita");
        pizzaController.updatePizza("Margarita", "Hot Margarita");
        assertThat(pizzaController.readPizza("Hot Margarita").getRealName(), is("Hot Margarita"));
    }

    @Test
    public void deletePizzaTest() {
        final PizzaController pizzaController = new PizzaController();
        pizzaController.createPizza("Margarita");
        assertThat(pizzaController.deletePizza("Margarita"), is(true));
    }
}
