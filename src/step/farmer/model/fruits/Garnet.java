package step.farmer.model.fruits;

import step.farmer.enums.Color;
import step.farmer.model.Fruit;

public class Garnet extends Fruit {
    public static final String rusName = "Гранат";

    public Garnet(int weight, Color color) {
        super(weight, color);
    }

    @Override
    public String getRusName() {
        return rusName;
    }
}
