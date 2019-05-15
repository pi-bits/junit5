package com.serviceinfotech.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAssertionTest {
    private static final Logger log = Logger.getLogger(GroupAssertionTest.class.getName());
    @Test
    void groupAssertions() {
        int[] numbers = {0, 1, 2, 3, 4};
        assertAll("numbers",
                () -> assertEquals(numbers[0], 0),
                () -> assertEquals(numbers[1], 1),
                () -> assertEquals(numbers[2], 2),
                () -> assertEquals(numbers[3], 3),
                () -> assertEquals(numbers[4], 4)
        );
        Assertions.assertTrue(2==2,()->"Assertion messages can be lazily evaluated --\n" +
                 "to avoid constructing complex messages unnecessarily");
    }


    @Test
    void lazyAssertions() {

        Assertions.assertTrue(3==3,()->"Assertion messages can be lazily evaluated --\n" +
                "to avoid constructing complex messages unnecessarily");
    }

    @RepeatedTest(10)
    void repeatedTest() {
        log.info("executes 10 times");
    }


}
