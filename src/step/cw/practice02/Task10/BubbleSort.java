package step.cw.practice02.Task10;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr7) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr7.length - 1; i++) {
                if (arr7[i] > arr7[i + 1]) {
                    temp = arr7[i];
                    arr7[i] = arr7[i + 1];
                    arr7[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return arr7;
    }


    public static int[] bubbleSortReverse(int[] arr8) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = arr8.length - 1; i < 0; i--) {
                if (arr8[i] > arr8[i - 1]) {
                    temp = arr8[i];
                    arr8[i] = arr8[i - 1];
                    arr8[i - 1] = temp;
                    sorted = false;
                }
            }
        }
        return arr8;
    }

}
