package com.training.patterns.src.factory;

import static com.training.patterns.src.factory.Ford.Model;

public interface CarFactory {
    public Car makeCar(final Model model);
}
