package agh.cs.lab;

public class Car {
    private MapDirection orientation = MapDirection.North;
    private Position position = new Position(2,2);

    private final static Position SWBound = new Position(0,0);
    private final static Position NEBound = new Position(4,4);
    @Override
    public String toString() {
        return "Car position: " + position + " orientation: " + orientation;
    }

    public void move(MoveDirection direction) {
        switch(direction) {
            case Forward: run(1);
                break;
            case Backward: run(-1);
                break;
            case Right: orientation = orientation.next();
                return;
            case Left: orientation = orientation.previous();
                return;
        }

    }

    public MapDirection getOrientation() {
        return orientation;
    }

    public Position getPosition() {
        return position;
    }

    public void run(int distance) {
        Position newPosition = new Position(0,0);

        switch(orientation) {
            case North: newPosition = position.add(new Position(distance, 0));
                break;
            case South: newPosition = position.add(new Position(-distance, 0));
                break;
            case East: newPosition = position.add(new Position(0, distance));
                break;
            case West: newPosition = position.add(new Position(0, -distance));
                break;
        }
        if(SWBound.smaller(newPosition) && newPosition.smaller(NEBound)) {
            position = newPosition;
        }


    }
}
