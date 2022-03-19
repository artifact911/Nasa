package enumEx.planet;

import enums.Day;

public class Test {
    public static void main(String[] args) {
        double earthWeight = 15;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Вес на планете %s равен %f%n",
                    p, p.surfaceweight(mass));

        System.out.println(Planet.EARTH.ordinal());

        for (Day value : Day.values()) {
            System.out.println(value + " " + value.getRusName());
        }
    }

}

