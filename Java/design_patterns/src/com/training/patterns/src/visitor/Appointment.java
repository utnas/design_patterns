package com.training.patterns.src.visitor;

public class Appointment {

    private String partnerName;

    public Appointment(final String partnerName) {
        this.partnerName = partnerName;
    }

    public String getPartnerName() {
        return partnerName;
    }
}
