package step.farmer.model.fruits;

import step.farmer.enums.Color;
import step.farmer.model.Fruit;

public class Apricot extends Fruit {

    public static final String rusName = "Абрикос";

    public Apricot(int weight, Color color) {
        super(weight, color);
    }

    @Override
    public String getRusName() {
        return rusName;
    }
}


