package step.hw.hw8.task05;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task05Work {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("How many Runners do you want?");
            createRunner(in.nextInt());
        } catch (IOException e) {
            System.out.println("Caught exception in main");
            System.err.println(e.getClass().getName());
            e.getCause();
        } catch (InputMismatchException e) {
            System.out.println("Invalid quantity of objects");
            System.err.println(e.getClass().getName());
            e.getCause();
        }
    }

    private static void createRunner(int quantity) throws IOException {
        int score = 0;
        //arrayRunner = new Runner[quantity - 1];
        while (score < quantity) {
            System.out.println("Create object number " + score);
            try {
                score++;
                new Runner().halt();
            } catch (RuntimeException e) {
                System.out.println("halt");
                System.out.println(e.getClass().getName());
            }

        }
    }
}
