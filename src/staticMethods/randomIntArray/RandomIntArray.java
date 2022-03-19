package staticMethods.randomIntArray;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public abstract class RandomIntArray {
    public static int[] getRandomArrayInt() {

        try (Scanner input = new Scanner(System.in)) {
            Random ran = new Random();
            System.out.println("Enter length of array:");
            int[] array = new int[input.nextInt()];
            System.out.println("Enter MIN value:");
            int min = input.nextInt();
            System.out.println("Enter MAX value:");
            int max = input.nextInt();
            for (int i = 0; i < array.length; i++) {
                array[i] = ran.nextInt(max - min) + min;
            }
            return array;
        } catch (NegativeArraySizeException e) {
            System.err.println("Invalid size of array. Please, enter valid value.");
            System.err.println(e.getClass().getName());
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.err.println("Invalid MIN or MAX value. Please, enter valid date.");
            System.err.println(e.getClass().getName());
        }
        System.err.println("Array hasn't created. Please, try again.");
        return null;
    }

}
