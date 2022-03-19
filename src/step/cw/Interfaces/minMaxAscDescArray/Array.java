package step.cw.Interfaces.minMaxAscDescArray;

import java.util.Arrays;
import java.util.Collections;

public class Array implements IShow, IMath, ISort {
    private Integer[] array;

    public Array(Integer[] array) {
        this.array = array;
    }

    @Override
    public void sortAsc() {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    @Override
    public void sortDesc() {
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));

    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(array));
        System.out.println();

    }

    @Override
    public void print(String info) {
        System.out.println(info);
        System.out.println(Arrays.toString(array));
    }

    @Override
    public Integer max() {
        System.out.print("Max value is: ");
        Arrays.sort(array);

        return array[array.length - 1];
    }

    @Override
    public Integer min() {
        System.out.print("Min value is: ");
        Arrays.sort(array);

        return array[0];
    }

    @Override
    public Double avg() {
        int score = 0;
        for (int i = 0; i < array.length; i++) {
            score += array[i];
        }
        Double avg = (double) score / array.length;
        System.out.print("Avg value is: ");
        return avg;
    }

    public Integer[] getArray() {
        return array;
    }
}
