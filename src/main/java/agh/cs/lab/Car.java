package agh.cs.lab;

public class Car implements IMapElement {
    private MapDirection orientation;
    private Position position;
    private final IWorldMap map;

    @Override
    public String toString() {
        switch(orientation) {
            case North:
                return "^";
            case South:
                return "v";
            case West:
                return "<";
            case East:
                return ">";
        }
        return null;
    }

    public Car(IWorldMap map, int x, int y) {
        this.orientation = MapDirection.North;
        this.position = new Position(x,y);
        this.map = map;
    }

    public Car(IWorldMap map) {
        this(map, 0, 0);
    }

    public boolean move(MoveDirection direction) {
        switch(direction) {
            case Forward: return run(1);
            case Backward: return run(-1);
            case Right: orientation = orientation.next();
                return true;
            case Left: orientation = orientation.previous();
                return true;
        }
        return false;
    }

    public MapDirection getOrientation() {
        return orientation;
    }

    public Position getPosition() {
        return position;
    }

    public boolean run(int distance) {
        Position newPosition = new Position(0,0);

        switch(orientation) {
            case North: newPosition = position.add(new Position(0, distance));
                break;
            case South: newPosition = position.add(new Position(0, -distance));
                break;
            case East: newPosition = position.add(new Position(distance, 0));
                break;
            case West: newPosition = position.add(new Position(-distance, 0));
                break;
        }
        if(map.canMoveTo(newPosition)) {
            position = newPosition;
            return true;
        }
        else {
            return false;
        }


    }
}
