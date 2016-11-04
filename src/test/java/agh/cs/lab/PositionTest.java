package agh.cs.lab;

import agh.cs.lab.Position;
import org.junit.Test;

import static org.junit.Assert.*;

public class PositionTest {
    @Test
    public void testToString() throws Exception {
        assertEquals("(1,2)", new Position(1, 2).toString());
        assertEquals("(-1,-2)", new Position(-1, -2).toString());
        assertEquals("(0,0)", new Position(0, 0).toString());
    }

    @Test
    public void testSmaller() throws Exception {
        assertTrue(new Position(0, 0).smaller(new Position(1, 1)));
        assertTrue(new Position(0, 0).smaller(new Position(0, 0)));
        assertTrue(new Position(-1, -1).smaller(new Position(-1, -1)));

        assertFalse(new Position(0, 0).smaller(new Position(-1, -1)));
        assertFalse(new Position(1, 1).smaller(new Position(0, 0)));
        assertFalse(new Position(-1, -1).smaller(new Position(-2, -2)));
    }

    @Test
    public void testLarger() throws Exception {
        assertTrue(new Position(1, 1).larger(new Position(0, 0)));
        assertTrue(new Position(0, 0).larger(new Position(0, 0)));
        assertTrue(new Position(-1, -1).larger(new Position(-1, -1)));

        assertFalse(new Position(-1, -1).larger(new Position(0, 0)));
        assertFalse(new Position(0, 0).larger(new Position(1, 1)));
        assertFalse(new Position(-2, -2).larger(new Position(-1, -1)));

    }

    @Test
    public void testAdd() throws Exception {
        assertEquals(new Position(3, 3), new Position(1, 1).add(new Position(2, 2)));
        assertEquals(new Position(-3, -3), new Position(-1, -1).add(new Position(-2, -2)));
        assertEquals(new Position(0, 0), new Position(-1, -1).add(new Position(1, 1)));
    }

}