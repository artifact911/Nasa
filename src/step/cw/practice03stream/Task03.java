package step.cw.practice03stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();
        int score = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                for (String value : line.split("(\\W)|(\\s)")) {
                    if (value.equalsIgnoreCase("world")) {
                        score++;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
        System.out.println(score);
    }
}
