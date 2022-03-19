package step.farmer.model;


import step.farmer.enums.Color;
import step.farmer.enums.Type;

public abstract class Vegetable extends Harvest {

    public Vegetable(int weight, Color color) {
        super(weight, color, Type.VEGETABLES);

    }
}
