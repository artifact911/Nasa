package step.hw.meo;

public class MilitaryEnlistmentOffice {
    static GeneratorRandomRecruit generatorRandomRecruit = new GeneratorRandomRecruit();

    public static void main(String[] args) {
        Recruit[] arrayRecruit = new Recruit[1000];
        for (int i = 0; i < arrayRecruit.length; i++) {
            arrayRecruit[i] = generatorRandomRecruit.next();
        }
        Doctors[] docs1 = {new Dentist(), new Oculist(), new Psychiatrist(), new Surgeon(), new Therapist()};
        Comission comission = new Comission(docs1);

        ArrayEverything<Recruit> recruits = new ArrayEverything<>(arrayRecruit);
        ArrayEverything<Recruit> valid = new ArrayEverything<>(new Recruit[0]);
        ArrayEverything<Recruit> invalid = new ArrayEverything<>(new Recruit[0]);

        for (Recruit recruit : arrayRecruit) {
            comission.test(recruit);
            if (recruit.isValid()) {
                valid.addOld(recruit);
            } else {
                invalid.addOld(recruit);
            }
        }
        RecruitComparatorName recruitComparatorName = new RecruitComparatorName();
        valid.sort(recruitComparatorName);
        invalid.sort(recruitComparatorName);

        print(valid.getArrayEverything());
        System.out.println();
        print(invalid.getArrayEverything());
        System.out.println("Number of valid ones are " + valid.size());
        System.out.println("Number of unfit are " + invalid.size());

        /*Arrays.sort(valid.getArrayEverything());
        System.out.println(Arrays.toString(valid.getArrayEverything()));

        Doctors[] docs2 = {new Dentist(), new Oculist(), new Surgeon()};
        Comission comission2 = new Comission(docs2);

        Comission comissionMax = MeoStaticMethods.getMax(comission, comission2);
        System.out.println(comissionMax.getArrayDocs().length);



        valid.sort(new RecruitComparatorID<>());
        System.out.println(Arrays.toString(valid.getArrayEverything()));
        searchTheSame(valid.getArrayEverything());

         */

       /* while (valid.hasNext()){
            System.out.println(valid.getIndex());
           valid.next();
        }
        System.out.println("Finish" + " " + valid.getArrayEverything().length);

        */
        valid.setIndex(valid.getArrayEverything().length - 1);
        while (valid.hasPrevious()) {
            System.out.println(valid.getIndex());
            valid.previous();
        }
        System.out.println("Finish" + " " + valid.getArrayEverything().length);

    }

    private static <T extends HaveID> void searchTheSame(T[] array) {
        int score = 1;
        for (int i = 0; i < array.length; i++) {
            //System.out.println(array[i].getID());
            if (i == array.length - 1) {
                break;
            }
            if (array[i].getID() == array[i + 1].getID()) {
                score++;
                continue;
            }
            if (score > 1) {
                System.out.println("Object in index " + i + " occurs " + score + " times.");
                score = 1;
            }
        }
        System.out.println("Search for identical IDs completed");
    }

    private static void print(Recruit[] recruit) {
        for (Recruit value : recruit) {
            System.out.println(value.toString());
        }
    }
}
