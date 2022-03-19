package step.cw.practice03stream;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean successful;

        do {

            try {
                successful = true;
                System.out.println("Input first number:");
                int num1 = input.nextInt();

                System.out.println("Input second number:");
                int num2 = input.nextInt();

                if (num1 == 0 || num2 == 0) {
                    throw new ArithmeticException();
                }

                while (num2 != 0) {
                    int tmp = num1 % num2;
                    num1 = num2;
                    num2 = tmp;
                }
                if (num1 < 0) {
                    num1 = (int) (Math.sqrt(Math.pow(num1, 2)));
                }
                System.out.println("GSD of numbers is " + num1);


            } catch (NoSuchElementException e) {
                successful = false;
                System.err.println("You've input invalid data. Please, input a integer number.");
            } catch (ArithmeticException e) {
                System.err.println("One of the numbers is zero. Please, input valid data.");
                successful = false;
            } finally {
                input.close();
            }

        } while (!successful);

        input.close();

    }
}
