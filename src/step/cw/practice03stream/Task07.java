package step.cw.practice03stream;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input MIN of range");
            int min = input.nextInt();

            System.out.println("Input MAX of range");
            int max = input.nextInt();

            System.out.println("Input number of range");
            int num = input.nextInt();

            if (num < min || num > max) {
                throw new OutOfRangeException(num);
            } else {
                System.out.println("The number belong to the range.");
            }
        } catch (OutOfRangeException e) {
            System.err.println(e.getClass().getName());
            System.err.println(e.getMessage());
            System.err.println(e.getNumber());
        }
    }

    public static class OutOfRangeException extends Exception {
        private int number;

        public OutOfRangeException(int num) {
            this.number = num;
        }

        public int getNumber() {
            return number;
        }

        @Override
        public String getMessage() {
            return "The number doesn't belong to the range!";
        }
    }
}
