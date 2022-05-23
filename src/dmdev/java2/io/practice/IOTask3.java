package dmdev.java2.io.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд;
 */
public class IOTask3 {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "dmdev", "java2", "io", "resources", "test.txt");
        Files.readAllLines(path).stream()
             .map(IOTask3::findDigitsCount)
             .forEach(System.out::println);
    }

    private static Integer findDigitsCount(String line) {
        int result = 0;
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                counter++;
            } else {
                if (result < counter) {
                    result = counter;
                }
                counter = 0;
            }
        }
        return result;
    }
}
