package com.java.patterns.tests.visitor;


import com.java.patterns.src.visitor.PreSale;
import com.java.patterns.src.visitor.Prospect;
import com.java.patterns.src.visitor.RDManager;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PreSaleTest {
    @Test
    public void testShouldHaveAppointWithVisitedGuest() {
        PreSale preSale = new PreSale("Jay", "514-235-2572");
        preSale.visit(new Prospect("Art Italia"));
        assertThat(preSale.getAppointments().get(0).getPartnerName(), is("Art Italia"));
    }

    @Test
    public void testShouldHaveAppointWithVisitedRDManagerGuest() {
        PreSale preSale = new PreSale("Jay", "514-235-2572");
        preSale.visit(new RDManager("Albira"));
        assertThat(preSale.getAppointments().get(0).getPartnerName(), is("Albira"));
    }
}
