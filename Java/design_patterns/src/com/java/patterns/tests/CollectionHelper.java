package com.java.patterns.tests;

import com.java.patterns.src.observer.User;
import com.java.patterns.src.visitor.Appointment;
import com.java.patterns.src.visitor.Visitable;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Iterables.isEmpty;
import static com.google.common.collect.Lists.newArrayList;
import static java.util.Collections.*;

public class CollectionHelper {

    public static Matcher<List<?>> hasValues(final String... values) {
        return new BaseMatcher<List<?>>() {
            public boolean matches(Object objects) {
                if (values.length == 0) {
                    return isEmpty((Iterable<?>) objects);
                } else {
                    return ((Collection<?>) objects).containsAll(newArrayList(values));
                }
            }

            public void describeTo(Description description) {
                // do nothing
            }
        };
    }

    public static Collection<Visitable> collect(final Visitable... elements) {
        ArrayList<Visitable> result = newArrayList();
        addAll(result, elements);
        return unmodifiableCollection(result);
    }

    public static List<String> toStringList(final List<Appointment> appointments) {
        List<String> result = newArrayList();
        for (final Appointment appointment : appointments) {
            result.add(appointment.getPartnerName());
        }
        return unmodifiableList(result);
    }

    public static User createUser(final String userName) {
        return new User(userName);
    }
}
