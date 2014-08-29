package com.java.patterns.src.factory;

import static com.java.patterns.src.factory.Ford.Model;

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
        return String.valueOf(model);
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
