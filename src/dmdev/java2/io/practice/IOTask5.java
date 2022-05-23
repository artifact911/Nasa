package dmdev.java2.io.practice;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.*;

/**
 * Задан файл с java-кодом. Прочитать текст программы из файла и записать в другой файл в обратном порядке символы каждой строки.
 */
public class IOTask5 {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "dmdev", "java2", "io", "practice", "IOTask4.java");
        Path result = Path.of("src", "dmdev", "java2", "io", "resources", "IOTask4new.java");

        try (Stream<String> lines = Files.lines(path); BufferedWriter bufferedWriter = Files.newBufferedWriter(result, APPEND, CREATE)) {

            lines.map(StringBuilder::new)
                    .map(StringBuilder::reverse)
                    .forEach(line -> {
                        try {
                            bufferedWriter.write(line.toString());
                            bufferedWriter.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        }
    }
}

