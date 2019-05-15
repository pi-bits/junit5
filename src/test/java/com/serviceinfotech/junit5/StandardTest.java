package com.serviceinfotech.junit5;

import org.junit.jupiter.api.*;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.fail;
public class StandardTest {

    private static final Logger log = Logger.getLogger(StandardTest.class.getName());

    @BeforeAll
    static void initAll()
    {
        log.info("@BeforeAll - executes once before all test methods in this class");
    }

    @BeforeEach
    void setUp() {
        log.info("@BeforeEach - executes before each test method in this class");
    }

    @DisplayName("Single test successful")
    @Test
    void succeedingTest() {
        log.info("Success");
    }

    @Test
    void failingTest()
    {
        fail("A failing test");
    }

    @Test
    @Disabled("For demo")
    void skippedTest(){
        //not executed
    }

    @AfterEach
    void tearDown() {
        log.info("@AfterEach - executed after each test method.");

    }

    @AfterAll
   static void  tearDownAll() {
        log.info("@AfterAll - executed after all test methods.");
    }
}
