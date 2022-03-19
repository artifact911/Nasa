package step.cw.queue;

public class HumanAdapter implements Comparable<HumanAdapter> {
    private Human human;
    private StringBuilder names;
    private int count;


    @Override
    public String toString() {
        return "HumanAdapter{" +
                "human=" + human +
                ", names=" + names +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(HumanAdapter o) {
        return this.count - o.count;
    }

    public StringBuilder getNames() {
        return names;
    }

    public void setNames(StringBuilder names) {
        this.names = names;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }
}
