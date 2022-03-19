package step.cw.practice02.Task10.Task10t8.Parts10t8;

public class Part4 {
    public static void product(int[][] array1, int[][] array2) {

        int[] arr10 = array1[0];
        int[] arr11 = array1[1];
        int[] arr20 = array2[0];
        int[] arr21 = array2[1];

        int prod00 = arr10[0] * arr20[0];
        int prod01 = arr10[1] * arr20[1];
        int prod10 = arr11[0] * arr21[0];
        int prod11 = arr11[1] * arr21[1];

        int[][] arrayProd = new int[][]{{prod00, prod01}, {prod10, prod11}};

        System.out.println("Product matrix is: ");

        for (int[] ints : arrayProd) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println();

    }
}
