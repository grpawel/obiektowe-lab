package agh.cs.lab;

import java.util.List;

public abstract class AbstractMapElement implements IMapElement{

    protected Position position;

    public AbstractMapElement(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }



}
