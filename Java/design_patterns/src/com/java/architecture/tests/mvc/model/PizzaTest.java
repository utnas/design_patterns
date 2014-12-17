package com.java.architecture.tests.mvc.model;

import com.java.architecture.src.mvc.model.Pizza;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PizzaTest {

    @Test
    public void itShouldCreateAPizza() {
        final Pizza pizza = new Pizza("The Name of my pizza");
        pizza.addIngredient("Cheat");
        assertThat(pizza.getIngredients(), is("Cheat"));
    }

    @Test
    public void itShouldGiveNameOfPizza() {
        final Pizza pizza = new Pizza("The Name of my pizza");
        pizza.addIngredient("Cheat");
        assertThat(pizza.getRealName(), is("The Name of my pizza Cheat"));
    }

    @Test
    public void itShouldCreateAEmptyPizza() {
        final Pizza pizza = new Pizza("Cheat");
        assertThat(pizza.getIngredients(), is(""));
    }

    @Test
    public void itShouldGiveAEmptyPizzaName() {
        final Pizza pizza = new Pizza("Cheat");
        assertThat(pizza.getRealName(), is("Cheat"));
    }

}
