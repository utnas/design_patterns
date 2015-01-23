package com.java.architecture.src.mvc.model;

public class FakePizza implements Pizza {
    public String getRealName() {
        return "";
    }

    public boolean addIngredient(Ingredient ingredient) {
        return false;
    }
}
