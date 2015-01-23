package com.java.architecture.tests.mvc.view;

import com.java.architecture.src.mvc.model.ConcretePizza;
import com.java.architecture.src.mvc.view.PizzaOrderingView;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PizzaOrderingViewTest {

    @Test
    public void itShouldOrderAPizza() {
        final PizzaOrderingView mock = mock(PizzaOrderingView.class);
        when(mock.order("Margareta")).thenReturn(new ConcretePizza("Margareta"));

        final ConcretePizza pizza = mock.order("Margareta");
        assertThat(pizza.getRealName(), is("Margareta"));

    }

}
