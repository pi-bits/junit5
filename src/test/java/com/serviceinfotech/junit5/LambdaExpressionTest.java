package com.serviceinfotech.junit5;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LambdaExpressionTest {

    @Test
    void lambdaExpressions() {
        assertTrue(Stream.of(1, 2, 3).count()>2, () ->"Sum should be greater than 5");
    }

}
