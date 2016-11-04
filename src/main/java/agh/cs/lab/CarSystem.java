package agh.cs.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarSystem {
    public static void main(String[] args) {
        OptionsParser parser = new OptionsParser();
        String[] options = new String[4];
        options[0] = "right";
        options[1] = "f";
        options[2] = "forward";
        options[3] = "forward";
        List<MoveDirection> directions = parser.parse(options);
        Car car = new Car();
        for(MoveDirection direction : directions) {
            car.move(direction);
            System.out.println(car);
        }
        System.out.println(new String("a").equals("a"));
        System.out.println(Arrays.equals(new String[]{"a"}, new String[]{"a"}));


    }
}
