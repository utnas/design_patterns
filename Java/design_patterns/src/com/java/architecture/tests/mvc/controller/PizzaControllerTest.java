package com.java.architecture.tests.mvc.controller;

import com.java.architecture.src.mvc.controller.PizzaController;
import com.java.architecture.src.mvc.model.Pizza;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PizzaControllerTest {

    @Test
    public void createPizzaTest() {
        final PizzaController pizzaController = new PizzaController();
        assertThat(pizzaController.createPizza("Margarita"), is(true));
    }

    @Test
    public void readPizzaTest() {
        final PizzaController mock = mock(PizzaController.class);
        when(mock.readPizza("Margarita")).thenReturn(new Pizza("Margarita"));
        assertThat(mock.readPizza("Margarita").getRealName(), is("Margarita"));
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
