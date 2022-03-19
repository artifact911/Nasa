package step.farmer.model;


import step.farmer.enums.Color;
import step.farmer.enums.Type;

public abstract class Fruit extends Harvest {

    public Fruit(int weight, Color color) {
        super(weight, color, Type.FRUITS);

    }
}
