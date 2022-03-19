package step.farmer.model.vegetables;

import step.farmer.enums.Color;
import step.farmer.model.Vegetable;

public class Potato extends Vegetable {

    public static final String rusName = "Картофель";

    public Potato(int weight, Color color) {
        super(weight, color);
    }

    @Override
    public String getRusName() {
        return rusName;
    }
}
