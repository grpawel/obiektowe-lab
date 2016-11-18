package agh.cs.lab;

import java.util.ArrayList;
import java.util.List;

public class RectangularMap extends AbstractWorldMap {
    private final Position SWBound;
    private final Position NEBound;

    public RectangularMap(int width, int height) {
        this.SWBound = new Position(0,0);
        this.NEBound = new Position(width,height);
    }

    public boolean canMoveTo(Position position) {
        boolean isWithinMapArea = SWBound.smaller(position) && position.smaller(NEBound);
        boolean isNotOccupied = !isOccupied(position);
        return isWithinMapArea && isNotOccupied;
    }

    public boolean add(Car car) {

    }

    public void run(MoveDirection[] directions) {

    }

    protected Position getLowerLeft() {
        return SWBound;
    }

    protected Position getUpperRight() {
        return NEBound;
    }

    public Object objectAt(Position position) {
        for (Car mapElement : mapElements) {
            if(mapElement.getPosition().equals(position)) {
                return mapElement;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        MapVisualizer visualiser = new MapVisualizer();
        return visualiser.dump(this,SWBound, NEBound);
    }
}
