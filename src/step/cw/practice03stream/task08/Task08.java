package step.cw.practice03stream.task08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task08 {
    public static void main(String args[]) {

        try (BufferedReader br = new BufferedReader(new FileReader("D:\\_ArtifactDOC\\_Developer\\Шаг\\" +
                "IDE_IdeaProjects\\NASA\\src\\step.cw.practice03stream\\task08\\demo"))) {
// could generate FileNotFoundException (checked)
            int max = -1;
            String line = br.readLine();
// could generate IOException (checked)
            while (line != null) {
                int n = Integer.parseInt(line);
// could generate NumberFormatException (unchecked)
                if (n > max) max = n;
                line = br.readLine();
// could generate IOException (checked)
            }
            System.out.println("Maximum = " + max);
        } catch (FileNotFoundException e) {
            System.err.println("File is not found.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid value was found.");
        } catch (IOException e) {
            System.err.println("File reading error.");
        }
    }
}
