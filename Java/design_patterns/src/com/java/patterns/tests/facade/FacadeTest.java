package com.java.patterns.tests.facade;

import com.java.patterns.src.facade.Company;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class FacadeTest {
    @Test
    public void testGetSpecificationFromHelix() {
        Company company = new Company("Helix System");
        assertThat(company.deliverSpecification(), is("Audit Trail"));
    }

    @Test
    public void testShouldNotGiveCorrectSpecificationFromHelix() {
        Company company = new Company("Helix System");
        assertThat(company.deliverSpecification(), not("Context Panel"));
    }

    @Test
    public void testShouldGiveABadSoftware() {
        Company company = new Company("Helix");
        assertThat(company.deliverSoftware(), not("Enovia"));
    }

    @Test
    public void testShouldGiveAGoodSoftware() {
        Company company = new Company("Helix");
        assertThat(company.deliverSoftware(), is("PLM360"));
    }

}
