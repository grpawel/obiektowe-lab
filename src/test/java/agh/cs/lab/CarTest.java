package agh.cs.lab;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by grosz on 04.11.2016.
 */
public class CarTest {

    @Test
    public void testInitialPosition() throws Exception {
        Car testedCar = new Car();
        Position expectedPosition = new Position(2, 2);
        assertEquals(expectedPosition, testedCar.getPosition());
    }

    @Test
    public void testInitialOrientation() throws Exception {
        Car testedCar = new Car();
        MapDirection expectedDirection = MapDirection.North;
        assertEquals(expectedDirection, testedCar.getOrientation());
    }

    @Test
    public void testNorthBound() throws Exception {
        Car testedCar = new Car();

        testedCar.move(MoveDirection.Forward);
        testedCar.move(MoveDirection.Forward);
        testedCar.move(MoveDirection.Forward);

        Position expectedPosition = new Position(4, 2);
        assertEquals(expectedPosition, testedCar.getPosition());
    }

    @Test
    public void testMoveToNorth() throws Exception {
        Car testedCar = new Car();

        testedCar.move(MoveDirection.Forward);

        Position expectedPosition = new Position(3,2);
    }

    @Test
    public void testLeftTurn() throws Exception {


    }
}