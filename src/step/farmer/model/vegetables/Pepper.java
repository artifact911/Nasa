package step.farmer.model.vegetables;

import step.farmer.enums.Color;
import step.farmer.model.Vegetable;


public class Pepper extends Vegetable {

    public static final String rusName = "Перец";

    public Pepper(int weight, Color color) {
        super(weight, color);
    }

    @Override
    public String getRusName() {
        return rusName;
    }
}
