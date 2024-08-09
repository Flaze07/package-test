package com.github.flaze07;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LinkedListTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldBeNotEmpty() {
        LinkedList ll = new LinkedList();
        ll.add(20);
        ll.add(30);

        var temp = ll.find(20);

        assertTrue(temp.isPresent());
    }

    @Test
    public void shouldBeEmpty() {
        LinkedList ll = new LinkedList();
        ll.add(20);
        ll.add(30);

        var temp = ll.find(21);

        assertTrue(temp.isEmpty());
    }
}
