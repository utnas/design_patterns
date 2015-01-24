package com.training.patterns.src.factory;

import static com.training.patterns.src.factory.Ford.Model;
import static java.lang.String.valueOf;

public class FordFocus implements Car {
    private final Model model;
    private final String version;
    private final String factoringYear;

    public FordFocus(final Model model, final String version, final String factoringYear) {
        this.model = model;
        this.version = version;
        this.factoringYear = factoringYear;
    }

    @Override
    public String getModel() {
        return valueOf(model);
    }

    @Override
    public String getVersion() {
        return version;
    }

    @Override
    public String getFactoringYear() {
        return factoringYear;
    }
}
