package step.cw.queue;

public class Human {
    private String name;
    private String language;
    private String hearOption;
    private String hat;
    private int codeOfDnk;

    public Human(String name, String language, String hearOption, String hat, int codeOfDnk) {
        this.name = name;
        this.language = language;
        this.hearOption = hearOption;
        this.hat = hat;
        this.codeOfDnk = codeOfDnk;
    }

    @Override
    public String toString() {
        return "Human " + getName() + " with DNK " + getCodeOfDnk();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return codeOfDnk == human.codeOfDnk;
    }

    @Override
    public int hashCode() {
        return codeOfDnk;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public String getHearOption() {
        return hearOption;
    }

    public int getCodeOfDnk() {
        return codeOfDnk;
    }

    public String getHat() {
        return hat;
    }
}
