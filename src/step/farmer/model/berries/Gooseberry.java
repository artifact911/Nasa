package step.farmer.model.berries;

import step.farmer.enums.Color;
import step.farmer.model.Berry;

public class Gooseberry extends Berry {

    public static final String rusName = "Крыжовник";

    public Gooseberry(int weight, Color color) {
        super(weight, color);
    }

        @Override
        public String getRusName() {
            return rusName;
        }
    }
