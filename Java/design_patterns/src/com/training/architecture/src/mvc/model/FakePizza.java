package com.training.architecture.src.mvc.model;

public final class FakePizza implements Pizza {
    public final String getRealName() {
        return "";
    }

    public final boolean addIngredient(Ingredient ingredient) {
        return false;
    }
}
