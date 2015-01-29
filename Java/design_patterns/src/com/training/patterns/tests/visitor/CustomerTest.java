package com.training.patterns.tests.visitor;


import com.training.patterns.src.visitor.Customer;
import com.training.patterns.src.visitor.ConcretePreSale;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CustomerTest {
    @Test
    public void acceptPreSalesVisit() {
        Customer artItaly = new Customer("Art Italy");
        final ConcretePreSale joel = new ConcretePreSale("Joel", "212-233-1244");
        artItaly.accept(joel);
        assertThat(artItaly.visited(), is(true));
    }
}
