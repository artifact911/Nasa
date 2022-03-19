package step.farmer.model.berries;

import step.farmer.enums.Color;
import step.farmer.model.Berry;

public class Currant extends Berry {

    public static final String rusName = "Смородина";

    public Currant(int weight, Color color) {
        super(weight, color);
    }

    @Override
    public String getRusName() {
        return rusName;
    }
}


