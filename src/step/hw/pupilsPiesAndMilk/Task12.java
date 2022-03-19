package step.hw.pupilsPiesAndMilk;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите общее число учеников в школе:");
        int allpupils = in.nextInt();
        System.out.println("Введите процент учеников в школе с весом МЕНЕЕ 30кг.:");
        int precentLess30 = in.nextInt();
        in.close();

        double precentMore30 = 100 - precentLess30;
        double more30 = allpupils / 100d * precentMore30;
        double less30 = allpupils / 100d * precentLess30;
        double normalPie = more30 + less30;
        double milk = 0.2;
        double needBottleMilk = Math.ceil(less30 * milk / 0.9);

        if (less30 > 0) {
            double needPie = normalPie + less30;
            System.out.printf("Требуется пирожков: %f шт. Пакетов молока %f", needPie, needBottleMilk);

        } else {
            System.out.printf("Требуется пирожков: %f шт.", more30);
        }


    }
}
