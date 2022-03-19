package step.cw.practice03stream;

import java.io.*;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();
        String fileName1 = "Test";


        try (BufferedReader br = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName1))) {

            String line;
            StringBuilder newText = new StringBuilder();
            while ((line = br.readLine()) != null) {
                newText.append(line.replace('.', '!'));
            }

            writer.write(newText.toString());
            System.out.println(newText);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            in.close();
        }

    }
}
