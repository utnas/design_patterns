package com.training.patterns.tests.observer.observe;

import com.training.patterns.src.observer.observe.Code;
import com.training.patterns.src.observer.observe.Observe;
import com.training.patterns.src.observer.observer.IObserver;
import com.training.patterns.src.observer.observer.UserObserver;
import org.junit.Test;

import java.util.ArrayList;

import static com.google.common.collect.Lists.newArrayList;
import static com.training.patterns.tests.CollectionHelper.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CodeTest {

    @Test
    public void itShouldAddObserver() {
        ArrayList<IObserver> observers = newArrayList(createUser("My first Name"), createUser("My second Name"));
        assertThat(newArrayList(makeAList(observers)), hasValues("My first Name", "My second Name"));
    }

    @Test
    public void itShouldRemoveObserver() {
        UserObserver firstUser = createUser("My first Name");
        UserObserver secondUser = createUser("My second Name");
        ArrayList<IObserver> observers = newArrayList(firstUser, secondUser);
        final Observe code = new Code(observers);
        code.removeObserver(firstUser);
        assertThat(newArrayList(makeAList(observers)), hasValues("My second Name"));
        assertThat(code.getObservers().size(), is(1));

    }

    @Test
    public void itShouldNotifyAllObservers() {
        UserObserver firstUser = createUser("My first Name");
        UserObserver secondUser = createUser("My second Name");
        ArrayList<IObserver> observers = newArrayList(firstUser, secondUser);
        final Code code = new Code(observers);
        firstUser.addObserve(code);
        secondUser.addObserve(code);

        assertThat(firstUser.getMessage(), is(""));
        assertThat(secondUser.getMessage(), is(""));
        code.setValue("Changed");
        assertThat(firstUser.getMessage(), is("Changed"));
        code.setValue("Changed again");
        assertThat(secondUser.getMessage(), is("Changed again"));
    }
}
