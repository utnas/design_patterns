package com.java.architecture.tests.mvc.model;

import com.java.architecture.src.mvc.model.Ingredient;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class IngredientTest {

    @Test
    public void itShouldCreateAnIngredient() {
        final Ingredient ingredient = new Ingredient("Name of my ingredient");
        assertThat(ingredient.getName(), is("Name of my ingredient"));
    }
}
