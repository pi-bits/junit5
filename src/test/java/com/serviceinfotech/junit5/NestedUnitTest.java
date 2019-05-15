package com.serviceinfotech.junit5;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NestedUnitTest {
    private static final Logger log = Logger.getLogger(NestedUnitTest.class.getName());

    @BeforeEach
    public void init() {
        log.info("@BeforeEach - executes before each test method in this class");
    }

    @Test
    public void testParent() {
        assertTrue(5 > 2);

    }

    @Nested
    @DisplayName("Children Test Login Feature")
    class ChildFeatureTest {

        @Test
        void testChild() {
            assertTrue(2>1);
        }

    }

}
