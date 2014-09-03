package com.java.patterns.tests;

import com.java.patterns.src.visitor.Appointment;
import com.java.patterns.src.visitor.Visitable;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Collections.*;

public class TestHelper {

    public static Matcher<List<?>> hasValues(final String... values) {
        return new BaseMatcher<List<?>>() {
            @Override
            public boolean matches(Object objects) {
                return values.length != 0 && ((Collection<?>) objects).containsAll(newArrayList(values));
            }

            @Override
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
}
