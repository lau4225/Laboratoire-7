package test;
import collections.Pile;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by bonla1731834 on 2018-03-19.
 */
class PileTest {

    Pile<String> test;


    @BeforeEach
    void setUp() {
        test = new Pile<String>();
    }

    @org.junit.jupiter.api.Test
    void push() {
        test.push("a");
        test.push("b");
        test.push("c");
        test.push("d");

        assertEquals(test.peek(), "d");

        assertEquals(test.pop(), "d");

        test.pop();

        assertEquals(test.peek(), "b");

        assertEquals(test.size(),2);

        test.clear();

        assertEquals(test.size(),0);

    }

    @Test
    void pop() {
    }

    @Test
    void peek() {
    }

    @Test
    void clear() {
    }

    @Test
    void size() {
    }

}