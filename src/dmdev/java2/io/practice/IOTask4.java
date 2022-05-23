package dmdev.java2.io.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *  Задан файл с java-кодом. Прочитать текст программы из файла и все слова public в объявлении артибутов
 *     и методов класса заменить на слово private. Результат сохранить в другой заранее созданный файл;
 */
public class IOTask4 {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "dmdev", "java2", "io", "practice", "IOTask3.java");
        String stringValue = Files.readString(path);
        String result = stringValue.replace("public", "private");

        Path resultPath = Path.of("src", "dmdev", "java2", "io", "resources", "IOTask3new.java");
        Files.writeString(resultPath, result);
    }
}
