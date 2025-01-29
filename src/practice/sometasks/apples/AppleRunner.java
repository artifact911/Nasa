package practice.sometasks.apples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppleRunner {

    public static void main(String[] args) {
        List<Apple> appleList = List.of(new Apple("Антоновка", 2, 50, "Октябрь"),
                                        new Apple("Адайред", 4, 100, "Cентябрь"),
                                        new Apple("Богатырь", 5 , 150, "Ноябрь"),
                                        new Apple("Голден", 3, 50, "Август"),
                                        new Apple("Фуджи", 300, 50, "Июль"),
                                        new Apple("Ранетки", 180, 50, "Ноябрь"),
                                        new Apple("Дичка", 1, 100, "Июль"),
                                        new Apple("Белый налив", 2, 500, "Август"));

        List<Apple> apples = new ArrayList<>(appleList);

        List<String> sortedApple = apples.stream()
                .filter(apple -> apple.getWeight() > 3)
                .sorted(Comparator.comparingInt(Apple::getWeight))
                .map(Apple::getSort)
                .toList();

        System.out.println();
    }
}
