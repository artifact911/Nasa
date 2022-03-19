package step.cw.practice02.Task09;

import java.util.Scanner;

public class Pr09t3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a text:");
        String mainText = in.nextLine();
        System.out.println("Input word for search:");
        String searchWord = in.nextLine();
        System.out.println("Input word instead of search word:");
        String change = in.nextLine();
        in.close();
        int count = 0;

        while (mainText.indexOf(searchWord, count) != -1) {
            count = mainText.indexOf(searchWord, count);
            count++;

            if (count != 0) {
                String newText = mainText.replace(searchWord, change);
                System.out.println(newText);
            } else {
                System.out.println("There are not any repetitions");
            }
        }
    }
}
