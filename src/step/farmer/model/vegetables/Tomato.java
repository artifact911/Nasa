package step.farmer.model.vegetables;

import step.farmer.enums.Color;
import step.farmer.model.Vegetable;

public class Tomato extends Vegetable {

    public static final String rusName = "Помидор";

    public Tomato(int weight, Color color) {
        super(weight, color);
    }

    @Override
    public String getRusName() {
        return rusName;
    }
}
