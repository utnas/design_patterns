package com.training.patterns.tests.facade;

import com.training.patterns.src.facade.CompanyFacade;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class FacadeTest {
    @Test
    public void testGetSpecificationFromHelix() {
        CompanyFacade companyFacade = new CompanyFacade("Helix System");
        assertThat(companyFacade.deliverSpecification(), is("Audit Trail"));
    }

    @Test
    public void testShouldNotGiveCorrectSpecificationFromHelix() {
        CompanyFacade companyFacade = new CompanyFacade("Helix System");
        assertThat(companyFacade.deliverSpecification(), not("Context Panel"));
    }

    @Test
    public void testShouldGiveABadSoftware() {
        CompanyFacade companyFacade = new CompanyFacade("Helix");
        assertThat(companyFacade.deliverSoftware(), not("Enovia"));
    }

    @Test
    public void testShouldGiveAGoodSoftware() {
        CompanyFacade companyFacade = new CompanyFacade("Helix");
        assertThat(companyFacade.deliverSoftware(), is("PLM360"));
    }

}
