package com.java.patterns.src.visitor;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Collections.unmodifiableList;

public class PreSale implements SalesVisitor {
    private final String name;
    private final String phoneNumber;
    private List<Appointment> appointments = newArrayList();

    public PreSale(final String name, final String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void visit(Prospect prospect) {
        appointments.add(new Appointment(prospect.getName()));
    }

    @Override
    public void visit(Customer customer) {

    }

    @Override
    public void visit(RDManager rdManager) {
        appointments.add(new Appointment(rdManager.getSales()));
    }

    public List<Appointment> getAppointments() {
        return unmodifiableList(appointments);
    }
}
