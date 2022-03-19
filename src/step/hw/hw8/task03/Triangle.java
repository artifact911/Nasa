package step.hw.hw8.task03;

import java.util.Arrays;
import java.util.Scanner;

public final class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() throws IllegalArgumentException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side A:");
        this.sideA = input.nextDouble();
        System.out.println("Enter side B:");
        this.sideB = input.nextDouble();
        System.out.println("Enter side C:");
        this.sideC = input.nextDouble();

        double[] sideArray = {sideA, sideB, sideC};
        Arrays.sort(sideArray);
        if (sideArray[2] > (sideArray[0] + sideArray[1])) {
            throw new IllegalArgumentException("Unable to create a triangle");
        } else {
            System.out.println("The triangle is created successfully!");
        }
        input.close();
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }
}

