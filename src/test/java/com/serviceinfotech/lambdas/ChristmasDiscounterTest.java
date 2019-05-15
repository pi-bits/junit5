package com.serviceinfotech.lambdas;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


public class ChristmasDiscounterTest {
    private Discounter discounter;

    @Test
    public void calculateChristmasDiscount() {
        discounter = new ChristmasDiscounter();
        BigDecimal discountedValue = discounter.applyDiscount(BigDecimal.valueOf(100));
        MatcherAssert.assertThat(discountedValue.toString(), Is.is("25.00"));
    }
}