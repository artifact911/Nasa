package step.farmer.model.vegetables;


import step.farmer.enums.Color;
import step.farmer.model.Vegetable;

public class Radish extends Vegetable {

    public static final String rusName = "Редиска";

    public Radish(int weight, Color color) {
        super(weight, color);
    }

    @Override
    public String getRusName() {
        return rusName;
    }
}
