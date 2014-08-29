package com.java.patterns.src.factory;

import static com.java.patterns.src.factory.Ford.Model;

public interface CarFactory {
    public Car makeCar(final Model model);
}
