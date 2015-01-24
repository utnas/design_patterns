package com.training.patterns.src.visitor;

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
    public void visit(final Prospect prospect) {
        appointments.add(new Appointment(prospect.getName()));
    }

    @Override
    public void visit(final Customer customer) {
        appointments.add(new Appointment(customer.getName()));
    }

    @Override
    public void visit(final RDManager rdManager) {
        appointments.add(new Appointment(rdManager.getSales()));
    }

    public List<Appointment> getAppointments() {
        return unmodifiableList(appointments);
    }
}
