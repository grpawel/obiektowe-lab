package agh.cs.lab;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractWorldMap implements IWorldMap {
    protected final List<Car> cars;

    public AbstractWorldMap() {
        this.cars = new ArrayList<Car>();
    }

    public boolean canMoveTo(Position position) {
        return !isOccupied(position);
    }

    public boolean add(Car car) {
        if(!isOccupied(car.getPosition())) {
            cars.add(car);
            return true;
        }
        else {
            return false;
        }
    }

    public void run(MoveDirection[] directions) {
        for(int i=0; i < directions.length; i++) {
            cars.get(i % cars.size()).move(directions[i]);
        }
    }

    public boolean isOccupied(Position position) {
        for (Car car : cars) {
            if(car.getPosition().equals(position)) {
                return true;
            }
        }
        return false;
    }

    public IMapElement elementAt(Position position) {
        for (Car car : cars) {
            if(car.getPosition().equals(position)) {
                return car;
            }
        }
        return null;
    }

    private abstract Position getLowerLeft();
    private abstract Position getUpperRight();

}
