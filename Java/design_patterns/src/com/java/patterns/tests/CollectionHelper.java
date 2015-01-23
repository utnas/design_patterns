package com.java.patterns.tests;

import com.java.architecture.src.mvc.model.ConcretePizza;
import com.java.patterns.src.observer.User;
import com.java.patterns.src.visitor.Appointment;
import com.java.patterns.src.visitor.Visitable;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static com.google.common.collect.Iterables.isEmpty;
import static com.google.common.collect.Lists.newArrayList;
import static java.util.Collections.*;

public class CollectionHelper {

    public static Matcher<List<?>> hasValues(final String... values) {
        return new BaseMatcher<List<?>>() {
            public boolean matches(final Object objects) {
                if (values.length == 0) {
                    return isEmpty((Iterable<?>) objects);
                } else {
                    return ((Collection<?>) objects).containsAll(newArrayList(values));
                }
            }

            public void describeTo(final Description description) {
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
        result.addAll(appointments.stream().map(Appointment::getPartnerName).collect(Collectors.toList()));
        return unmodifiableList(result);
    }


    public static ConcretePizza getPizza(final String subject, final ArrayList<ConcretePizza> store) {
        for (final Object storedElement : store) {
            if (((ConcretePizza) storedElement).getRealName().equals(subject)) {
                return (ConcretePizza) storedElement;
            }
        }
        return new ConcretePizza("");
    }

    public static User createUser(final String userName) {
        return new User(userName);
    }
}
