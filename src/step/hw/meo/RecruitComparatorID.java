package step.hw.meo;

import java.util.Comparator;

public class RecruitComparatorID<T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        if (o1 instanceof HaveID && o2 instanceof HaveID) {
            return Integer.compare(((HaveID) o1).getID(), ((HaveID) o2).getID());
        } else {
            System.out.println("Object don't have ID");
            return 0;
        }
    }
}
