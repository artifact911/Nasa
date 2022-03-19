package step.farmer.model.fruits;

import step.farmer.enums.Color;
import step.farmer.model.Fruit;

public class Plum extends Fruit {

    public static final String rusName = "Слива";

    public Plum(int weight, Color color) {
        super(weight, color);
    }

    @Override
    public String getRusName() {
        return rusName;
    }
}
