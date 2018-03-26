package test;

import collections.LinkedList;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by bonla1731834 on 2018-03-19.
 */
class LinkedListTest {

    LinkedList<String> test;

    @org.junit.jupiter.api.BeforeEach
    void setUp(){
        test = new LinkedList<String>();

        String a = "a";
        String b = "b";
        String c = "c";


        test.add(a);
        test.add(b);
        test.add(c);

    }

    @org.junit.jupiter.api.Test
    void add() { //avec indice

        //ajouter au debut
        test.add(0,"d");
        assertEquals(test.get(0),"d");
        assertEquals(test.get(1),"a");
        assertEquals(test.get(2),"b");
        assertEquals(test.get(3),"c");

        //ajouter au milieu
        test.add(2,"e");
        assertEquals(test.get(0),"d");
        assertEquals(test.get(1),"a");
        assertEquals(test.get(2),"e");
        assertEquals(test.get(3),"b");
        assertEquals(test.get(4),"c");

        //ajouter a la fin
        test.add(5,"f");
        assertEquals(test.get(0),"d");
        assertEquals(test.get(1),"a");
        assertEquals(test.get(2),"e");
        assertEquals(test.get(3),"b");
        assertEquals(test.get(4),"c");
        assertEquals(test.get(5),"f");


    }

    @Test
    void add1() { //sans indice

        test.add("d");
        assertEquals(test.get(0),"a");
        assertEquals(test.get(1),"b");
        assertEquals(test.get(2),"c");
        assertEquals(test.get(3),"d");

    }

    @Test
    void set() {
        test.set(1,"d");
        assertEquals(test.get(0),"a");
        assertEquals(test.get(1),"d");
        assertEquals(test.get(2),"c");
    }

    @Test
    void get() {
        assertEquals(test.get(0),"a");
        assertEquals(test.get(1),"b");
        assertEquals(test.get(2),"c");
    }

    @Test
    void remove() {

        test.add("d");
        test.add("e");
        test.add("f");

        //enlever au debut
        test.remove(0);
        assertEquals(test.get(0),"b");
        assertEquals(test.get(1),"c");
        assertEquals(test.get(2),"d");
        assertEquals(test.get(3),"e");
        assertEquals(test.get(4),"f");

        //enlever au milieu
        test.remove(2);
        assertEquals(test.get(0),"b");
        assertEquals(test.get(1),"c");
        assertEquals(test.get(2),"e");
        assertEquals(test.get(3),"f");

        //enlever a la fin
        test.remove(3);
        assertEquals(test.get(0),"b");
        assertEquals(test.get(1),"c");
        assertEquals(test.get(2),"e");


    }

    @Test
    void clear() {

        String d = "d";
        String e = "e";
        String f = "f";

        test.add(d);
        test.add(e);
        test.add(f);

        test.clear();
        assertEquals(test.getFirst(),null);
        assertEquals(test.getLast(),null);
        assertEquals(test.size(),0);
    }

    @Test
    void size() {
        assertEquals(test.size(), 3);
    }

}