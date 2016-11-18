package agh.cs.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarSystem {
    public static void main(String[] args) {
        OptionsParser parser = new OptionsParser();
        String[] options = "f b r l f f r r f f f f f f f f".split("\\s");
        List<MoveDirection> directions = parser.parse(options);
        System.out.println(directions.size());
        RectangularMap map = new RectangularMap(10,5);
        System.out.println(map);
        map.add(new Car(map));
        map.add(new Car(map, 3,4));
        System.out.println(map);
        map.run(directions.toArray(new MoveDirection[]{}));
        System.out.println(map);
        /*
        for(MoveDirection direction : directions) {
            car.move(direction);
            System.out.println(car);
            System.out.println(map);
        }
        */
    }
}
