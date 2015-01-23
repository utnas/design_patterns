package com.java.architecture.tests.mvc.utils.storage;

import com.java.architecture.src.mvc.model.ConcretePizza;
import com.java.architecture.src.mvc.model.FakePizza;
import com.java.architecture.src.mvc.model.Pizza;
import com.java.architecture.src.mvc.utils.storage.generic.StorageEngine;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StorageEngineTest {
    @Test
    public void itShouldAddElementInToAStorageSystem() {
        final StorageEngine storageEngine = new StorageEngine();
        assertThat(storageEngine.add("New Object", (subject, store) -> store.add(subject)), is(true));
    }

    @Test
    public void itShouldRemoveElementFromSystemStorage() {
        final StorageEngine storageEngine = new StorageEngine();
        storageEngine.add("To Be Removed", (subject, store) -> store.add(new ConcretePizza(subject)));
        storageEngine.delete("To Be Removed", (subject, store) -> {
            Pizza pizzaByRealName = storageEngine.getPizzaByRealName("To Be Removed");
            return store.remove(pizzaByRealName);
        });
        assertThat(storageEngine.getPizzaByRealName("To Be Removed"), is(FakePizza.class));
    }
}