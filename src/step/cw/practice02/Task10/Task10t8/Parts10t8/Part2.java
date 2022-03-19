package step.cw.practice02.Task10.Task10t8.Parts10t8;

public class Part2 {
    public static void sum(int[][] array1, int[][] array2) {

        int[] arr10 = array1[0];
        int[] arr11 = array1[1];
        int[] arr20 = array2[0];
        int[] arr21 = array2[1];

        int sum00 = arr10[0] + arr20[0];
        int sum01 = arr10[1] + arr20[1];
        int sum10 = arr11[0] + arr21[0];
        int sum11 = arr11[1] + arr21[1];

        int[][] arraySum = new int[][]{{sum00, sum01}, {sum10, sum11}};

        System.out.println("Sum matrix is: ");

        for (int[] ints : arraySum) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println();

    }
}
