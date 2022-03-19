package step.hw.hw2;

public class PolindromArray {
    public static void main(String[] args) {
        int[] arrayInt = new int[]{1, 3, 5, 3, 1};
        int steps = arrayInt.length / 2;
        int flag = 0;
        System.out.println(steps);

        for (int i = 0; i <= steps; i++) {
            for (int j = arrayInt.length - 1; j >= arrayInt.length - steps; j--) {
                if (arrayInt[i] == arrayInt[j]) {
                    flag++;
                }
            }
        }
        if (flag >= steps) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
