package agh.cs.lab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OptionsParser {
    private Map<String, MoveDirection> optionToDirections;

    public OptionsParser() {
        this.optionToDirections = new HashMap<String, MoveDirection>();
        optionToDirections.put("f", MoveDirection.Forward);
        optionToDirections.put("forward", MoveDirection.Forward);
        optionToDirections.put("b", MoveDirection.Backward);
        optionToDirections.put("backward", MoveDirection.Backward);
        optionToDirections.put("r", MoveDirection.Right);
        optionToDirections.put("right", MoveDirection.Right);
        optionToDirections.put("l", MoveDirection.Left);
        optionToDirections.put("left", MoveDirection.Left);
    }

    public List<MoveDirection> parse(String[] options) {
        List<MoveDirection> directions = new ArrayList<MoveDirection>();
        for (String option : options) {
            MoveDirection direction = optionToDirections.get(option);
            if(direction == null) {
                throw new IllegalArgumentException(option + " is not legal move specification");
            }
            directions.add(direction);
        }
        return directions;
    }
}
