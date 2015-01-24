package com.training.architecture.tests.mvc.model;

import com.training.architecture.src.mvc.model.ConcretePizza;
import com.training.architecture.src.mvc.model.Ingredient;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PizzaTest {

    @Test
    public void itShouldCreateAPizza() {
        final ConcretePizza pizza = new ConcretePizza("The Name of my pizza");
        pizza.addIngredient(new Ingredient("Cheat"));
        assertThat(pizza.getRealName(), is("The Name of my pizzaCheat"));
    }

    @Test
    public void itShouldGiveNameOfPizza() {
        final ConcretePizza pizza = new ConcretePizza("The Name of my pizza");
        pizza.addIngredient(new Ingredient("Cheat"));
        assertThat(pizza.getRealName(), is("The Name of my pizzaCheat"));
    }

    @Test
    public void itShouldCreateAEmptyPizza() {
        final ConcretePizza pizza = new ConcretePizza("Cheat");
        assertThat(pizza.getIngredients().size(), is(0));
    }

    @Test
    public void itShouldGiveAEmptyPizzaName() {
        final ConcretePizza pizza = new ConcretePizza("Cheat");
        assertThat(pizza.getRealName(), is("Cheat"));
    }
}
