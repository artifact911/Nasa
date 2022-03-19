package step.hw.meo;

import java.util.Random;

public class GeneratorRandomRecruit {
    private String[] newFirstName = {"Иванов", "Петров", "Сидоров", "Паниковский", "Столяров", "Дударев", "Дураков",
            "Хренов", "Блинов", "Сапогов", "Холоп", "Суходрищенко", "Попандопало", "Киндзадзаев", "Бальзаминов",
            "Шишкин", "Коровин", "Азазелло", "Бодров", "Белый"};
    private String[] newSecondName = {"Алексей", "Валерий", "Дормидонт", "Евлампий", "Руслан", "Николай", "Федор",
            "Петр", "Андрей", "Исаак", "Даниил", "Иосиф", "Жора", "Степан", "Семен"};
    private String[] newMiddleName = {"Алексеевич", "Велерьевич", "Дормидонтович", "Евлампиевич", "Русланович",
            "Николаевич", "Федорович", "Петрович", "Андреевич", "Исаакович", "Диниилович", "Иосифович",
            "Георгиевич", "Степанович", "Семенович"};
    private String[] newDiagnosis = {"Healthy", "Crazy"};
    private int newImplantCount;
    private boolean newFlatFeet;
    private boolean newFracture;
    private double newCardiogram;
    private double newVisionCoeff;
    private double newWeigh;
    private int newHeight;
    private Random ranGen = new Random();

    protected Recruit next() {
        String name1 = newFirstName[ranGen.nextInt(newFirstName.length)];
        String name2 = newSecondName[ranGen.nextInt(newSecondName.length)];
        String name3 = newMiddleName[ranGen.nextInt(newMiddleName.length)];
        String diagn = newDiagnosis[ranGen.nextInt(newDiagnosis.length)];
        newImplantCount = ranGen.nextInt(2);
        newFlatFeet = ranGen.nextBoolean();
        newFracture = ranGen.nextBoolean();
        int minCardio = 58;
        int maxCardio = 92;
        newCardiogram = ranGen.nextInt(maxCardio - minCardio) + minCardio;
        int minVision = 7;
        int maxVision = 13;
        newVisionCoeff = (ranGen.nextInt(maxVision - minVision) + minVision) / 10F;
        newWeigh = 50.0 + 100.0 * ranGen.nextDouble();
        newHeight = ranGen.nextInt(210 - 150) + 150;

        return new Recruit(name1, name3, name2, diagn,
                newImplantCount, newFlatFeet, newFracture, newCardiogram, newVisionCoeff, newWeigh, newHeight);
    }

}
