package patterns.builder;

public enum Status {

    SINGLE(1, "Холост/Не замужем"),
    MARRIED(2, "Женат/Замужем"),
    DIVORCED(3, "В разводе");

    private int index;
    private String rusText;

    Status(int index, String rusText) {
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
