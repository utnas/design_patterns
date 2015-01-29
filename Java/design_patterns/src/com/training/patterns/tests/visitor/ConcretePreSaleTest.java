package com.training.patterns.tests.visitor;


import com.training.patterns.src.visitor.*;
import org.junit.Test;

import java.util.ArrayList;

import static com.google.common.collect.Lists.newArrayList;
import static com.training.patterns.tests.CollectionHelper.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConcretePreSaleTest {

    @Test
    public void testShouldHaveAppointWithVisitedRDManagerGuest() {
        ConcretePreSale concretePreSale = new ConcretePreSale("Jay", "514-235-2572");
        concretePreSale.visit(new RDManager("Albira"));
        assertThat(concretePreSale.getAppointments().get(0).getPartnerName(), is("Albira"));
    }

    @Test
    public void testShouldHaveAppointmentBook() {
        ArrayList<Visitable> visitableList = newArrayList();

        visitableList.addAll(collect(new Customer("Toyota"), new RDManager("Alan"), new Prospect("Art Confirm")));

        ConcretePreSale concretePreSale = new ConcretePreSale("Ryan", "123-223-3223");
        for (final Visitable visitable : visitableList) {
            visitable.accept(concretePreSale);
        }
        assertThat(toStringList(concretePreSale.getAppointments()), hasValues("Toyota", "Art Confirm", "Alan"));
    }

}
