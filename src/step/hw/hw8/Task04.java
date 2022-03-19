package step.hw.hw8;

import staticMethods.checkSortArray.CheckSortUp;
import staticMethods.randomIntArray.RandomIntArray;
import staticMethods.searchArray.BinarySearch;

import java.io.IOException;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        checkArray(RandomIntArray.getRandomArrayInt());
    }

    protected static void checkArray(int[] arrayNum) {
        try {
            //Arrays.sort(arrayNum);
            if (!CheckSortUp.isArraySortedUp(arrayNum)) {
                throw new IOException("Array isn't sorted");
            } else {
                System.out.println(Arrays.toString(arrayNum));
                System.out.println(BinarySearch.runBinarySearchIteratively(arrayNum, 2));
            }
        } catch (NullPointerException e) {
            System.err.println("Array is empty");
            System.err.println(e.getClass().getName());
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.err.println(e.getClass().getName());
        }
    }
}
