package andersen.toLab.task3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        int[] randomArrayInt = getRandomArrayInt();

        if (randomArrayInt != null) {
            System.out.println(Arrays.toString(randomArrayInt));
            for (int value : randomArrayInt) {
                if (value % 3 == 0 && value != 0) {
                    System.out.println(value + " кратно трем");
                }
            }
        } else {
            System.out.println("Пустой массив");
        }

    }


    private static int[] getRandomArrayInt() {
        try (Scanner input = new Scanner(System.in)) {
            Random ran = new Random();
            System.out.println("Enter length of array:");
            int[] array = new int[input.nextInt()];
            System.out.println("Enter MIN value:");
            int min = input.nextInt();
            System.out.println("Enter MAX value:");
            int max = input.nextInt();
            for (int i = 0; i < array.length; i++) {
                array[i] = ran.nextInt(max + min + 1);
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
