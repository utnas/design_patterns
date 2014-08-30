package com.java.patterns.tests;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class TestHelper {

    public static Matcher<List<?>> hasValues(final String... values) {
        return new BaseMatcher<List<?>>() {
            @Override
            public boolean matches(Object objects) {
                return values.length != 0 && ((Collection<?>) objects).containsAll(newArrayList(values));
            }

            @Override
            public void describeTo(Description description) {

            }
        };
    }
}
