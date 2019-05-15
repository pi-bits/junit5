package com.serviceinfotech.lambdas;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;


public class EasterDiscounterTest {

    private Discounter discounter;

    @Test
    public void calculateEasterDiscount() {
        discounter = amount -> amount.multiply(BigDecimal.valueOf(0.5));

        BigDecimal discountedValue = discounter.applyDiscount(BigDecimal.valueOf(100));
        assertThat(discountedValue, Is.is(BigDecimal.valueOf(50.0)));
    }
}