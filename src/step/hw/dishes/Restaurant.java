package step.hw.dishes;

public class Restaurant {

    private String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                '}';
    }
}
