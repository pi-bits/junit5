package com.serviceinfotech.iterators;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorIterableTest {

    ArrayList list = new ArrayList();


    @BeforeEach
    public void setUp() throws Exception {
        list.add("this");
        list.add("is");
        list.add("a");
        list.add("simple");
        list.add("test");
    }

    @Test
    public void shouldIterateWithIterator() {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

    @Test
    public void shouldIterateWithIteratorAndRemove() {
        Iterator firstIterator = list.iterator();
        while (firstIterator.hasNext()) {
            if ("simple".equals(firstIterator.next())) {
                firstIterator.remove();
            }
        }
        Iterator secondIterator = list.iterator();
        while (secondIterator.hasNext()) {
            System.out.println(secondIterator.next() + " ");
        }

    }

    @Test
    public void shouldIteratorAndForEachRemaining() {
        Iterator iterator = list.iterator();
        System.out.println(iterator.next() + "*");

        iterator.forEachRemaining((e) -> System.out.println(e + " "));
    }



}
