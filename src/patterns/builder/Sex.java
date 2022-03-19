package patterns.builder;

public enum Sex {

    MALE(1, "Мужской"),
    FEMALE(2, "Женский");

    private int index;
    private String rusText;

    Sex(int index, String rusText) {
        this.index = index;
        this.rusText = rusText;
    }

    public int getIndex() {
        return index;
    }

    public String getRusText() {
        return rusText;
    }
}
