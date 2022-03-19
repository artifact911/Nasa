package enumEx.calculator;

import java.util.Scanner;

public class CalculatorWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        for (Operations value : Operations.values()) {
            System.out.printf("%.1f %s %.1f = %.1f%n", x, value, y, value.apply(x, y));
        }

        // System.out.println(Operations.valueOf("PLUS"));
        Operations test = Operations.valueOf("PLUS");


    }
}
