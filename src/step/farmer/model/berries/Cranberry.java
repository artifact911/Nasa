package step.farmer.model.berries;

import step.farmer.enums.Color;
import step.farmer.model.Berry;

public class Cranberry extends Berry {

    public static final String rusName = "Клюква";

    public Cranberry(int weight, Color color) {
        super(weight, color);
    }

    @Override
    public String getRusName() {
        return rusName;
    }
}
