package step.cw.practice02.Task10;

public class Pr10t5 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3}, {7, 8, 9}};
        //System.out.println(Arrays.toString(array[0]));
        //System.out.println(Arrays.toString(array[1]));

        int sum = 0;

        for (int value : array[0]) {
            sum += value;

        }
        for (int value : array[1]) {
            sum += value;
        }
        int middle = sum / (array[0].length + array[1].length);
        System.out.printf("Sum is: %d, middle is: %d ", sum, middle);
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
