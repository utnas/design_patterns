package com.java.patterns.src.factory;

import static com.java.patterns.src.factory.Ford.Model;
import static com.java.patterns.src.factory.Ford.Model.*;

public class CarFactoryImpl implements CarFactory {
    @Override
    public Car makeCar(final Model model) {
        switch (model) {
            case FIESTA:
                return new FordFiesta(FIESTA, "2.0L", "2014-2015");
            case FOCUS:
                return new FordFocus(FOCUS, "3.0L", "2014-2015");
            default:
                return new FordFiesta(EMPTY, "", "");
        }
    }
}
