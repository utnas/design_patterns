package com.java.architecture.src.mvc.model;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Collections.unmodifiableList;

public final class ConcretePizza implements Pizza {
    private final String baseName;
    private List<Ingredient> ingredients = newArrayList();

    public ConcretePizza(final String baseName) {
        this.baseName = baseName;
    }

    public final String getRealName() {
        return computeName();
    }

    public final boolean addIngredient(final Ingredient ingredient) {
        return ingredients.add(ingredient);
    }

    public final List<Ingredient> getIngredients() {
        return unmodifiableList(ingredients);
    }

    private String computeName() {
        StringBuilder fullName = new StringBuilder(baseName);
        for (final Ingredient ingredient : ingredients) {
            fullName.append(ingredient.getName());
        }
        return fullName.toString().trim();
    }
}
