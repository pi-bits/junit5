package com.serviceinfotech.junit5;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;

public class ValueSourceParameterTest {

    @ParameterizedTest
    @ValueSource(strings = {"racecar", "radar", "able was I ere I saw elba"})
    void palindromeReadsSameBackward(String stringInput) {
        assertThat(isPalindrome(stringInput), Is.is(stringInput));
    }


    private String isPalindrome(String stringInput) {
        return new StringBuilder(stringInput).reverse().toString();
    }
}
