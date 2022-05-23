package dmdev.java2.io.practice;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы;
 */

public class IOTask1 {

    private static final String VOWELS = "уеыаоэёяию";

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "dmdev", "java2", "io", "resources", "test.txt");
        try(Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                char firstSymbol = word.charAt(0);
                if(VOWELS.indexOf(firstSymbol) != -1) {
                    System.out.println(word);
                }
            }
        }
    }
}
