package step.farmer.model;


import step.farmer.enums.Color;
import step.farmer.enums.Type;

public abstract class Berry extends Harvest {

    public Berry(int weight, Color color) {
        super(weight, color, Type.BERRIES);

    }

}
