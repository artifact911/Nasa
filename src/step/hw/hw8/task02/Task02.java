package step.hw.hw8.task02;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        getDoubleNum();
    }


    public static void getDoubleNum() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            Double num = input.nextDouble();

            System.out.println(num);
            giveNumber(num);
        } catch (IOException | IllegalArgumentException | InputMismatchException e) {
            System.err.println(e.getMessage());
            System.err.println(e.getClass().getName());
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println(e.getClass().getName());
        }
    }


    public static <T extends Number> void giveNumber(T num) throws Exception {
        if (num.doubleValue() < 0) {
            throw new ExUnchecked("Entered a negative number");
        }
        if (num.doubleValue() > 100) {
            throw new ExChecked("Entered the number more than 100");
        }
    }
}
