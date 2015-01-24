package com.training.patterns.tests.observer;

import com.training.patterns.src.observer.Code;
import com.training.patterns.src.observer.IObservable;
import com.training.patterns.src.observer.User;
import org.junit.Test;

import static com.training.patterns.tests.CollectionHelper.createUser;
import static com.training.patterns.tests.CollectionHelper.hasValues;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class CodeTest {


    @Test
    public void testWhenNoUpdateThenDefaultLengthShouldBeZero() {
        IObservable code = new Code();
        assertThat(code.getLength(), is(0));
    }


    @Test
    public void testWhenCodeIsUpdatedThenGetLengthShouldBeIncreased() {
        final User user = createUser("User 1");
        IObservable code = new Code();
        user.update(code);
        user.update(code);
        assertThat(code.getLength(), is(2));
    }

    @Test
    public void testWhenNoObserverThenLastModifierShouldBeEmpty() {
        final Code code = new Code();
        assertThat(code.getLastModifier(), is(""));
    }

    @Test
    public void testWhenCodeIsUpdatedAllObserversShouldBeUpdated() {
        final IObservable code = new Code();
        final User dooley = createUser("Dooley");
        final User lucy = createUser("Lucy");

        code.addObserver(dooley);
        code.addObserver(lucy);

        lucy.update(code);
        dooley.update(code);

        assertThat(dooley.getLastNotification(), is("Code was updated by Dooley. The current size is 2"));
    }

    @Test
    public void testWhenCodeIsUpdatedAllObserversShouldBeUpdatedSequentially() {
        final IObservable code = new Code();
        final User dooley = createUser("Dooley");
        final User lucy = createUser("Lucy");

        code.addObserver(dooley);
        code.addObserver(lucy);

        dooley.update(code);
        lucy.update(code);

        assertThat(dooley.getLastNotification(), not("Code was updated by Dooley. The current size is 2"));
    }

    @Test
    public void testWhenRemoveObserverShouldDeleteObserverFromList() {
        final Code code = new Code();
        final User user = createUser("A User");
        code.addObserver(user);

        assertThat(code.getObservers(), hasValues("A User"));
        code.removeObserver(user);
        assertThat(code.getObservers(), hasValues());
    }
}
