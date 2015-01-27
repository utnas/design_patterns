package com.training.patterns.tests.observer.observer;

import com.training.patterns.src.observer.observe.Code;
import com.training.patterns.src.observer.observer.UserObserver;
import org.junit.Test;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ObserverTest {

    @Test
    public void itShouldAddObserve() {
        final UserObserver userObserver = new UserObserver("My name");
        final Code observeCode = new Code(newArrayList(userObserver));
        observeCode.addObserver(userObserver);
        userObserver.addObserve(observeCode);
        assertThat(newArrayList(userObserver.getObserve()).size(), is(1));
    }
}
