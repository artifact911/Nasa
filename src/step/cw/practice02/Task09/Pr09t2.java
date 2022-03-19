package step.cw.practice02.Task09;

import java.util.Scanner;

public class Pr09t2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a text:");
        String mainText = in.nextLine(); // nextLine, чтоб пробелы читал и дальнейшие слова
        System.out.println("Input word for search:");
        String searchWord = in.nextLine();
        in.close();
        int flag = 0;
        int count = 0;

        while (mainText.indexOf(searchWord, count) != -1) {
            count = mainText.indexOf(searchWord, count);
            //System.out.println(count); //Это для понимания в каких индексах мои повторения
            count++;
            flag++;
        }

        if (flag != 0) {
            System.out.printf("Text has repetitions %d times", flag);

        } else {
            System.out.println("Text don't have any repetitions");
        }
    }
}
