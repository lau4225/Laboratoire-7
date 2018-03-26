package test;

import collections.File;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by bonla1731834 on 2018-03-19.
 */
class FileTest {

    File <String> test;

    @BeforeEach
    void setUp() {
        test = new File<String>();
    }

    @org.junit.jupiter.api.Test
    void add() {
        test.add("a");
        test.add("b");
        test.add("c");
        test.add("d");

        assertEquals(test.peek(), "a");

        test.remove();
        assertEquals(test.peek(), "b");

        test.remove();
        assertEquals(test.peek(), "c");


        assertEquals(test.size(),2 );

        test.clear();
        assertEquals(test.size(),0);

    }

    @Test
    void remove() {
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