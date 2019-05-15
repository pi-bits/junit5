package com.serviceinfotech.iterators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;


public class CollectionTest {

    private List list;

    @BeforeEach
    public void setUp() throws Exception {
        list = new ArrayList();
        list.add("this");
        list.add("is");
        list.add("a");
        list.add("simple");
        list.add("test");
    }

    @Test
    public void shouldRemoveIf() {
        list.forEach(System.out::println);
        list.removeIf((str) -> str.equals("this"));
        list.forEach(System.out::println);

    }

    @Test
    public void forEach() {
        list.forEach(System.out::println);
    }

    @Test
    public void spliterator() {
        Spliterator<String> spliterator = list.spliterator();
        spliterator.trySplit();
        System.out.println(spliterator.estimateSize());
        System.out.println(spliterator.characteristics());
//        spliterator.tryAdvance(System.out::println);
//        spliterator.forEachRemaining(System.out::println);
    }
}

