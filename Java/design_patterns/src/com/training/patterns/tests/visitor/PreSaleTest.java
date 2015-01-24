package com.training.patterns.tests.visitor;


import com.training.patterns.src.visitor.*;
import com.training.patterns.tests.CollectionHelper;
import org.junit.Test;

import java.util.ArrayList;

import static com.google.common.collect.Lists.newArrayList;
import static com.training.patterns.tests.CollectionHelper.hasValues;
import static com.training.patterns.tests.CollectionHelper.toStringList;
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

        visitableList.addAll(CollectionHelper.collect(new Customer("Toyota"), new RDManager("Alan"), new Prospect("Art Confirm")));

        PreSale preSale = new PreSale("Ryan", "123-223-3223");
        for (final Visitable visitable : visitableList) {
            visitable.accept(preSale);
        }
        assertThat(toStringList(preSale.getAppointments()), hasValues("Toyota", "Art Confirm", "Alan"));
    }

}
