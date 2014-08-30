package com.java.patterns.tests.visitor;


import com.java.patterns.src.visitor.Customer;
import com.java.patterns.src.visitor.PreSale;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CustomerTest {
    @Test
    public void acceptPreSalesVisit() {

        Customer artItaly = new Customer();
        final PreSale joel = new PreSale("Joel", "212-233-1244");
        artItaly.accept(joel);
        assertThat(artItaly.visited(), is(true));

    }
}
