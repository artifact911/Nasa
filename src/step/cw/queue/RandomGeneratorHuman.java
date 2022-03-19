package step.cw.queue;

import java.util.Random;

public class RandomGeneratorHuman {
    private String[] newName = {"Алексей", "Валерий", "Дормидонт", "Евлампий", "Руслан", "Николай", "Федор",
            "Петр", "Андрей", "Исаак", "Даниил", "Иосиф", "Жора", "Степан", "Семен"};
    private String[] newLanguage = {"English", "Russian", "Chinese", "Belorussian"};
    private String[] newHearOption = {"Лысый", "Эрокез", "Каре", "Лохмандей"};
    private String[] newHat = {"Hat", "Cap", "Cylinder", "Without Hat"};
    private int newCodeDnk;

    private Random random = new Random();

    protected Human next() {
        newCodeDnk = random.nextInt(199) + 1;

        return new Human(newName[random.nextInt(newName.length)], newLanguage[random.nextInt(newLanguage.length)],
                newHearOption[random.nextInt(newHearOption.length)], newHat[random.nextInt(newHat.length)], newCodeDnk);
    }


}
