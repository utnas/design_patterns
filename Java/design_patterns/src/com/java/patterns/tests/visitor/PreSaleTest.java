package com.java.patterns.tests.visitor;


import com.java.patterns.src.visitor.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static com.java.patterns.tests.TestHelper.hasValues;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PreSaleTest {

    @Test
    public void testShouldHaveAppointWithVisitedRDManagerGuest() {
        PreSale preSale = new PreSale("Jay", "514-235-2572");
        preSale.visit(new RDManager("Albira"));
        assertThat(preSale.getAppointments().get(0).getPartnerName(), is("Albira"));
    }

    @Test
    public void testShouldHaveAppointmentBook() {
        ArrayList<Visitable> visitableList = newArrayList();
        visitableList.add(new Customer("Toyota"));
        visitableList.add(new Prospect("Art Confirm"));
        visitableList.add(new RDManager("Alan"));

        PreSale preSale = new PreSale("Ryan", "123-223-3223");
        for (final Visitable visitable : visitableList) {
            visitable.accept(preSale);
        }
        assertThat(toStringList(preSale.getAppointments()), hasValues("Toyota", "Art Confirm", "Alan"));
    }

    private List<String> toStringList(List<Appointment> appointments) {
        List<String> result = newArrayList();
        for (final Appointment appointment : appointments) {
            result.add(appointment.getPartnerName());
        }
        return result;
    }

}
