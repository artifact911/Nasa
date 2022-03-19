package step.cw.Pupil.Comporator;

import java.util.Random;

public class PupilRandomGenerator {
    private String[] arrayNames = {"Саша", "Петя", "Коля", "Вася"};
    private Random random = new Random();

    public Pupils next() {
        int min = 7;
        int max = 15;
        String name = arrayNames[random.nextInt(arrayNames.length)];
        int age = random.nextInt(max - min) + min;
        int weight = random.nextInt(max - min) + min;

        Pupils pupils = new Pupils(arrayNames[random.nextInt(arrayNames.length)],
                random.nextInt(12), random.nextInt(40));
        return pupils;
    }
}


