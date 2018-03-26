package test;

import collections.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by bonla1731834 on 2018-03-19.
 */
class ArrayListTest {

    ArrayList<String> test;

    @org.junit.jupiter.api.BeforeEach
    void setUp(){
       test = new ArrayList<String>();

        test.add(0,"a");
        test.add(1,"b");
        test.add(2,"c");
    }

    @org.junit.jupiter.api.Test
    void add() { //avec index

        test.add(2,"d");


        assertEquals(test.get(0),"a");
        assertEquals(test.get(1),"b");
        assertEquals(test.get(2),"d");
        assertEquals(test.get(3),"c");


    }

    @org.junit.jupiter.api.Test
    void add1() { //sans index, ajoute a la fin

        test.add("d");

        assertEquals(test.get(0),"a");
        assertEquals(test.get(1),"b");
        assertEquals(test.get(2),"c");
        assertEquals(test.get(3),"d");

    }

    @org.junit.jupiter.api.Test
    void set() {
        test.set(1, "d");

        assertEquals(test.get(0),"a");
        assertEquals(test.get(1),"d");
        assertEquals(test.get(2),"c");

    }

    @org.junit.jupiter.api.Test
    void get() {

        assertEquals(test.get(0),"a");
        assertEquals(test.get(1),"b");
        assertEquals(test.get(2),"c");
    }

    @org.junit.jupiter.api.Test
    void remove() {
        test.remove(1);

        assertEquals(test.get(0),"a");
        assertEquals(test.get(1),"c");

    }

    @org.junit.jupiter.api.Test
    void clear() {

        test.clear();
        assertEquals(test.size(), 0);
    }

    @org.junit.jupiter.api.Test
    void size() {

        assertEquals(test.size(), 3);
    }

}