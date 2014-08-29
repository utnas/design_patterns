package com.java.patterns.src.factory;

import static com.java.patterns.src.factory.Ford.Model;

public class FordFiesta implements Car {
    private Model model;
    private String version;
    private String factoringYear;

    public FordFiesta(final Model model, String version, String factoringYear) {
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
