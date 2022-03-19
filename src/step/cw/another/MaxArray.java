package step.cw.another;

import java.util.Arrays;
import java.util.Random;

public class MaxArray {
    public static void main(String[] args) {
        int[] myArray = new int[7];
        myArray = initializeArray();
        int max = max(myArray);
        System.out.println(max);

    }

    public static int[] initializeArray() {
        Random ran = new Random();
        int[] array = new int[7];
        int min = 1;
        int max = 20;
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(max - min) + min;
        }
        return array;
    }

    public static int max(int[] myArray) {
        Arrays.sort(myArray);
        return myArray[myArray.length - 1];

    }


}
