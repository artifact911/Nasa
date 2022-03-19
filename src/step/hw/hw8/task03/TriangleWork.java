package step.hw.hw8.task03;

import java.util.InputMismatchException;

public class TriangleWork {
    public static void main(String[] args) {
        Triangle triangle = giveTriangle();
    }

    private static Triangle giveTriangle() {
        Triangle triangle = null;
        try {
            triangle = new Triangle();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            System.err.println(e.getClass().getName());
        } catch (InputMismatchException e) {
            System.err.println("Invalid side value!");
            System.err.println(e.getClass().getName());
        }
        return triangle;
    }
}
