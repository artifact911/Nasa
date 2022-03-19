package step.farmer.model.berries;


import step.farmer.enums.Color;
import step.farmer.model.Berry;

public class Blueberry extends Berry {

    public static final String rusName = "Черника";

    public Blueberry(int weight, Color color) {
        super(weight, color);
    }

    @Override
    public String getRusName() {
        return rusName;
    }
}
