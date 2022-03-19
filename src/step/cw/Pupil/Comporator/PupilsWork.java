package step.cw.Pupil.Comporator;

import java.util.Arrays;

public class PupilsWork {
    static PupilRandomGenerator pupilRandomGenerator = new PupilRandomGenerator();

    public static void main(String[] args) {

       /* Pupils[] arrayPupils = new Pupils[15];
        for (int i = 0; i < arrayPupils.length; i++) {
            arrayPupils[i] = pupilRandomGenerator.next();
        }
        System.out.println(Arrays.toString(arrayPupils));
*/

        Pupils pupils1 = new Pupils("Lee", 10, 40);
        Pupils pupils2 = new Pupils("Bruce", 12, 40);

        Pupils[] array = {pupils1, pupils2};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        /*PupilComporator pupilComporator = new PupilComporator();
        Arrays.sort(array, pupilComporator);
        Arrays.sort(array, new PupilComporator());
        System.out.println(Arrays.toString(array));

        System.out.println(pupils1.compareTo(pupils2));*/

        // Arrays.sort(array, Comparator.reverseOrder()); // reversSort
        // Arrays.sort(array, Collections.reverseOrder()); // reversSort


    }
}
