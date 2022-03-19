package step.farmer.model.berries;

import step.farmer.enums.Color;
import step.farmer.model.Berry;

public class Strawberry extends Berry {

    public static final String rusName = "Клубника";

    public Strawberry(int weight, Color color) {
        super(weight, color);
    }

    @Override
    public String getRusName() {
        return rusName;
    }
}
