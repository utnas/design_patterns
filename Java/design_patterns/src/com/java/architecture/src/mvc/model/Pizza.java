package com.java.architecture.src.mvc.model;

public class Pizza {
    private final String baseName;
    private StringBuilder ingredients;

    public Pizza(final String baseName) {
        this.baseName = baseName;
        this.ingredients = new StringBuilder("");
    }

    public String getRealName() {
        return baseName.concat(" " + ingredients.toString()).trim();
    }

    public String addIngredient(final String cheat) {
        return ingredients.append(cheat).toString();
    }

    public String getIngredients() {
        return ingredients.toString();
    }
}
