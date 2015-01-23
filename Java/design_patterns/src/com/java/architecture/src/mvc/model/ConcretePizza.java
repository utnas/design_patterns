package com.java.architecture.src.mvc.model;

import java.util.ArrayList;

import static com.google.common.collect.Lists.newArrayList;

public class ConcretePizza implements Pizza {
    private final String baseName;
    private ArrayList<Ingredient> ingredients = newArrayList();

    public ConcretePizza(final String baseName) {
        this.baseName = baseName;
    }

    public String getRealName() {
        return computeName();
    }


    public boolean addIngredient(final Ingredient ingredient) {
        return ingredients.add(ingredient);
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    private String computeName() {
        StringBuilder fullName = new StringBuilder(baseName);
        for (final Ingredient ingredient : ingredients) {
            fullName.append(ingredient.getName());
        }
        return fullName.toString().trim();
    }
}
