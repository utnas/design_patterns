package com.java.architecture.tests.mvc.utils.storage;

import com.java.architecture.src.mvc.utils.storage.generic.StorageEngine;
import com.java.architecture.src.mvc.utils.storage.generic.StorageResultHandler;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StorageEngineTest {
    @Test
    public void itShouldAddElementInToAStorageSystem() {
        final StorageEngine storageEngine = new StorageEngine();
        assertThat(storageEngine.add("New Object", new StorageResultHandler<Boolean>() {
            @Override
            public Boolean handle(final String subject, ArrayList store) {
                return store.add(subject);
            }
        }), is(true));
    }
}