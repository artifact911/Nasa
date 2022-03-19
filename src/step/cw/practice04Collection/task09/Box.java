package step.cw.practice04Collection.task09;

import java.util.Objects;

public class Box implements Comparable<Box> {
    private static Integer numId = 0;
    private int id;
    private int length;
    private int depth;
    private int height;

    public Box(int length, int depth, int height) {
        this.length = length;
        this.depth = depth;
        this.height = height;
        this.id = numId++;
    }

    @Override
    public String toString() {
        return "Box " + getId() + ": my value is " + length * depth * height;
    }

    @Override
    public int compareTo(Box o) {
        return Integer.compare(this.length * this.depth * this.height, o.getLength() * o.getDepth() * o.getHeight());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return length == box.length &&
                depth == box.depth &&
                height == box.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, depth, height);
    }

    public int getLength() {
        return length;
    }

    public int getDepth() {
        return depth;
    }

    public int getHeight() {
        return height;
    }

    public int getId() {
        return id;
    }
}
