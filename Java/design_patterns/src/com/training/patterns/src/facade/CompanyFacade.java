package com.training.patterns.src.facade;

public class CompanyFacade implements Facade {
    private String name;
    private EngineeringTeam engineering;
    private DevelopmentTeam development;

    public CompanyFacade(final String name) {
        this.name = name;
        engineering = new EngineeringTeam();
        development = new DevelopmentTeam();
    }

    public final String getName() {
        return name;
    }

    public final String deliverSpecification() {
        return engineering.makeSpecification();
    }

    public final String deliverSoftware() {
        return development.makeSoftware();
    }
}
