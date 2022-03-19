package step.farmer.utils;

import step.farmer.model.Harvest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class PrintUtil {
    public static final String PATH = "log.txt";

    public static void print(List<Harvest> list) {
        String harvestsPrint = list.stream().map(Harvest::toString).collect(joining("\n"));
        System.out.println(harvestsPrint);
        StringBuilder harvestFormating = new StringBuilder();
        harvestFormating
                .append(new Date().toString())
                .append(System.lineSeparator())
                .append(harvestsPrint);
        Path path = Paths.get(PATH);
        try {
            Files.writeString(path, harvestFormating.toString(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл " + e);
        }
    }
}

