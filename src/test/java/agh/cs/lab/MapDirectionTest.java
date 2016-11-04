package agh.cs.lab;

import agh.cs.lab.MapDirection;
import org.junit.Test;
import static org.junit.Assert.*;

public class MapDirectionTest {
    @Test
    public void toStringTest() throws Exception {
        assertEquals("Północ", MapDirection.North.toString());
        assertEquals("Południe", MapDirection.South.toString());
        assertEquals("Wschód", MapDirection.East.toString());
        assertEquals("Zachód", MapDirection.West.toString());
    }

    @Test
    public void nextTest() throws Exception {
        assertEquals(MapDirection.North, MapDirection.West.next());
        assertEquals(MapDirection.South, MapDirection.East.next());
        assertEquals(MapDirection.East, MapDirection.North.next());
        assertEquals(MapDirection.West, MapDirection.South.next());
    }

    @Test
    public void previousTest() throws Exception {
        assertEquals(MapDirection.North, MapDirection.East.previous());
        assertEquals(MapDirection.South, MapDirection.West.previous());
        assertEquals(MapDirection.East, MapDirection.South.previous());
        assertEquals(MapDirection.West, MapDirection.North.previous());
    }

}