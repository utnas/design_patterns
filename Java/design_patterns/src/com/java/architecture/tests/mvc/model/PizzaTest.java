package com.java.architecture.tests.mvc.model;

import com.java.architecture.src.mvc.model.Ingredient;
import com.java.architecture.src.mvc.model.Pizza;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PizzaTest {

    @Test
    public void itShouldCreateAPizza() {
        final Pizza pizza = new Pizza("The Name of my concreate");
        pizza.addIngredient(new Ingredient("Cheat"));
        assertThat(pizza.getRealName(), is("The Name of my pizzaCheat"));
    }

    @Test
    public void itShouldGiveNameOfPizza() {
        final Pizza pizza = new Pizza("The Name of my concreate");
        pizza.addIngredient(new Ingredient("Cheat"));
        assertThat(pizza.getRealName(), is("The Name of my pizzaCheat"));
    }

    @Test
    public void itShouldCreateAEmptyPizza() {
        final Pizza pizza = new Pizza("Cheat");
        assertThat(pizza.getIngredients().size(), is(0));
    }

    @Test
    public void itShouldGiveAEmptyPizzaName() {
        final Pizza pizza = new Pizza("Cheat");
        assertThat(pizza.getRealName(), is("Cheat"));
    }
}
