package com.training.patterns.src.facade;

public class Company {

    private String name;
    private EngineeringTeam engineering;
    private DevelopmentTeam development;

    public Company(final String name) {
        this.name = name;
        engineering = new EngineeringTeam();
        development = new DevelopmentTeam();
    }

    public String getName() {
        return name;
    }

    public String deliverSpecification() {
        return engineering.makeSpecification();
    }

    public String deliverSoftware() {
        return development.makeSoftware();
    }
}
