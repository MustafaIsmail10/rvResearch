package com.rvResearch;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Collection;
import java.util.Collections;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void shouldAnswerWithTrueAdd() {
        int result = App.add(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void shouldAnswerWithTrueTokin() {
        App a = new App();
        int x = a.tokin();
        assertEquals(1, x);
    }

    @Test
    public void countSynchronizedCollection() {
        Collection c = Collections.synchronizedCollection(Arrays.asList("Foo", "Bar"));
        App a = new App();
        assertEquals(2, a.count(c));
    }

    @Test
    public void itiratorTest() {
        App a = new App();
        int z = a.sumIterator();
        assertEquals(10, z);
    }

}
