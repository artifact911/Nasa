package step.farmer.model.fruits;


import step.farmer.enums.Color;
import step.farmer.model.Fruit;

public class Apple extends Fruit {

    public static final String rusName = "Яблоко";

    public Apple(int weight, Color color) {
        super(weight, color);
    }

    @Override
    public String toString() {
        return "Apple{ " + getColor() + " " + getWeight() + "}";
    }

    @Override
    public String getRusName() {
        return rusName;
    }
}
