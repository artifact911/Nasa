package step.cw.practice02.Task10.Task10t8.Parts10t8;

public class Part3 {
    public static void difference(int[][] array1, int[][] array2) {
        int[] arr10 = array1[0];
        int[] arr11 = array1[1];
        int[] arr20 = array2[0];
        int[] arr21 = array2[1];

        int dif00 = arr10[0] - arr20[0];
        int dif01 = arr10[1] - arr20[1];
        int dif10 = arr11[0] - arr21[0];
        int dif11 = arr11[1] - arr21[1];

        int[][] arrayDif = new int[][]{{dif00, dif01}, {dif10, dif11}};

        System.out.println("Difference matrix is: ");

        for (int[] ints : arrayDif) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
