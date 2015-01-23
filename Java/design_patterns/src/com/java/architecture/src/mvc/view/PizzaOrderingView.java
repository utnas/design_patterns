package com.java.architecture.src.mvc.view;

import com.java.architecture.src.mvc.controller.PizzaController;
import com.java.architecture.src.mvc.model.ConcretePizza;

public class PizzaOrderingView {
    private final PizzaController controller;

    public PizzaOrderingView() {
        controller = new PizzaController();
    }

    public ConcretePizza order(final String name) {
        controller.createPizza(name);
        return controller.readPizza(name);
    }
}
