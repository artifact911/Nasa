package step.cw.queue;

import java.util.Arrays;
import java.util.Comparator;

public class HumanWork {
    static RandomGeneratorHuman randomGeneratorHuman = new RandomGeneratorHuman();
    static HumanAdapter[] humanAdapters = new HumanAdapter[201];

    public static void main(String[] args) {
        Human[] arrayAllHuman = new Human[1000];
        for (int i = 0; i < arrayAllHuman.length; i++) {
            arrayAllHuman[i] = randomGeneratorHuman.next();
            // System.out.println(value.toString());
        }

        Arrays.sort(arrayAllHuman, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getCodeOfDnk() - o2.getCodeOfDnk();
            }
        });

        //System.out.println(Arrays.toString(arrayAllHuman));

        int index = 0;
        for (int i = 0; i < arrayAllHuman.length; i++) {
            Human human = arrayAllHuman[i];
            StringBuilder names = new StringBuilder();
            int count = 0;
            for (int j = i; j < arrayAllHuman.length; j++) {

                if (human.equals(arrayAllHuman[j])) {
                    count++;
                    names.append(arrayAllHuman[j].getName() + " ");
                }
            }
            HumanAdapter humanAdapter = new HumanAdapter();
            humanAdapter.setHuman(human);
            humanAdapter.setCount(count);
            humanAdapter.setNames(names);

            if (test(humanAdapter)) {
                humanAdapters[index] = humanAdapter;
                index++;
            }
        }

        // Arrays.sort(humanAdapters);

        System.out.println(Arrays.toString(humanAdapters));
    }

    public static boolean test(HumanAdapter humanAdapter) {
        for (int i = 0; i < humanAdapters.length; i++) {
            if (humanAdapters[i] != null && humanAdapters[i].getHuman().equals(humanAdapter.getHuman())) {
                return false;
            }
        }
        return true;
    }
}
