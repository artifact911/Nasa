package step.hw.hw2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CrateArrayString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input length of array:");
        int length = in.nextInt();

        in.nextLine();
        String[] array = new String[length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Input words for array");
            array[i] = in.nextLine();
        }
        in.close();
        System.out.println(Arrays.toString(array));
        int flag = 0;

        for (int i = 0; i < array.length; i++) {
            StringTokenizer words = new StringTokenizer(array[i], " ");

            while (words.hasMoreTokens()) {
                System.out.println(words.nextToken());
                flag++;
            }

        }

        System.out.println("There are " + flag + " words in the array");
    }
}
