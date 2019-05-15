package com.serviceinfotech.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionAssertionTest {

    @Test
    public void assertThrowsException() {
        String str = "eighteen";

        assertThrows(IllegalArgumentException.class, () -> {
            Integer.valueOf(str);
        });


    }


}
